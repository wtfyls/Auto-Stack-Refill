# Auto Stack Refill — version support

✅ = CI build verified for this mod target. This confirms compilation only, not in-game testing.
❌ = not built and verified yet.

| Minecraft version | Forge | Fabric | NeoForge |
|---|:---:|:---:|:---:|
| 1.20.1 | ✅ | ❌ | ❌ |
| 1.21.1 | ❌ | ❌ | ❌ |
| 1.21.11 | ❌ | ❌ | ❌ |
| 26.1 | ❌ | ❌ | ❌ |
| 26.1.1 | ❌ | ❌ | ❌ |
| 26.2 | ❌ | ❌ | ❌ |
| 26.3 | ❌ | ❌ | ❌ |

## Notes

- Only the **Forge 1.20.1** project currently has a successful CI build. Its refill behavior still needs in-game testing.
- All other listed loader/version combinations are planned targets, not downloadable releases.
- Other Minecraft versions have been removed from this repository's target matrix.
- Target folders are under `targets/<version>/<loader>/`; their `TARGET.json` files indicate whether the target is verified or scaffold-only.
- Java targets: 1.20.1 uses Java 17; 1.21.1 and 1.21.11 use Java 21; 26.1, 26.1.1, 26.2, and 26.3 use Java 25.
