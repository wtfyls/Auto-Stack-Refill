package dev.wtfyls.autostackrefill;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.common.MinecraftForge;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Mod(AutoStackRefill.MOD_ID)
public final class AutoStackRefill {
    public static final String MOD_ID = "autostackrefill";

    private final Map<UUID, HeldStackState> heldStacks = new ConcurrentHashMap<>();

    public AutoStackRefill() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase != TickEvent.Phase.END || !(event.player instanceof ServerPlayer player)) {
            return;
        }

        Inventory inventory = player.getInventory();
        int selectedSlot = inventory.selected;
        ItemStack held = inventory.getItem(selectedSlot);
        UUID playerId = player.getUUID();
        HeldStackState previous = heldStacks.get(playerId);

        // Switching hotbar slots starts tracking the newly selected slot; it should
        // not cause an old, intentionally empty slot to refill.
        if (previous == null || previous.selectedSlot() != selectedSlot) {
            heldStacks.put(playerId, HeldStackState.from(selectedSlot, held));
            return;
        }

        if (!held.isEmpty()) {
            heldStacks.put(playerId, HeldStackState.from(selectedSlot, held));
            return;
        }

        ItemStack template = previous.template();
        if (template.isEmpty()) {
            return;
        }

        for (int slot = 0; slot < inventory.getContainerSize(); slot++) {
            if (slot == selectedSlot) {
                continue;
            }

            ItemStack candidate = inventory.getItem(slot);
            if (!candidate.isEmpty() && ItemStack.isSameItemSameTags(template, candidate)) {
                int transferCount = Math.min(candidate.getCount(), template.getMaxStackSize());
                ItemStack replacement = candidate.split(transferCount);
                inventory.setItem(selectedSlot, replacement);
                inventory.setChanged();
                player.containerMenu.broadcastChanges();
                return;
            }
        }
    }

    @SubscribeEvent
    public void onPlayerLogout(PlayerEvent.PlayerLoggedOutEvent event) {
        heldStacks.remove(event.getEntity().getUUID());
    }

    private record HeldStackState(int selectedSlot, ItemStack template) {
        private static HeldStackState from(int selectedSlot, ItemStack stack) {
            ItemStack template = stack.isEmpty() ? ItemStack.EMPTY : stack.copyWithCount(1);
            return new HeldStackState(selectedSlot, template);
        }
    }
}
