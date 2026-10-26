# Auto Stack Refill

[![Build](https://github.com/wtfyls/Auto-Stack-Refill/actions/workflows/build.yml/badge.svg?branch=main)](https://github.com/wtfyls/Auto-Stack-Refill/actions/workflows/build.yml)

**Auto Stack Refill** is a Minecraft inventory QoL mod designed to refill your selected hotbar slot from a matching stack in your inventory when the stack you're holding runs out.

## Features

- **Automatic hotbar refills** — refill an emptied selected slot from another matching stack in your inventory.
- **Match-aware refills** — choose stacks matching the same item and item data instead of combining unlike variants.
- **Loader-portable project** — the roadmap covers Forge, Fabric, and NeoForge, tracked separately for each Minecraft version.
- **Version-specific tracking** — every target has its own status so planned ports aren't confused with verified builds.

The behavior is currently implemented in the Forge 1.20.1 project. CI compilation passes, but the mod still needs in-game testing before its behavior can be considered fully verified.

## Minecraft versions and loaders

These are the **only versions currently in the project roadmap**. A ✅ means the Auto Stack Refill target has passed CI compilation; ❌ means that target has not yet been built and verified. These marks describe this mod, not general availability of the loader itself.

| Minecraft version | Forge | Fabric | NeoForge |
|:--|:--:|:--:|:--:|
| 1.20.1 | ✅ | ❌ | ❌ |
| 1.21.1 | ❌ | ❌ | ❌ |
| 1.21.11 | ❌ | ❌ | ❌ |
| 26.1 | ❌ | ❌ | ❌ |
| 26.1.1 | ❌ | ❌ | ❌ |
| 26.2 | ❌ | ❌ | ❌ |
| 26.3 | ❌ | ❌ | ❌ |

For the detailed target status, see [SUPPORT_MATRIX.md](SUPPORT_MATRIX.md). Planned targets are not downloadable releases; each one needs a loader- and version-specific implementation, a successful build, and runtime testing.

## Build the current Forge 1.20.1 project

Requirements: **Java 17** and **Gradle 8.8**.

```bash
gradle build
```

The compiled mod jar is produced in `build/libs/`.

You can also check the latest [GitHub Actions build](https://github.com/wtfyls/Auto-Stack-Refill/actions).

## Project layout

- `src/main/` — current Forge 1.20.1 implementation
- `targets/<version>/<loader>/` — per-version and per-loader target status
- `support/minecraft-versions.json` — canonical list of Minecraft versions in scope
- `SUPPORT_MATRIX.md` — compact version/loader support table
- `platforms/README.md` — notes for loader-specific ports

## License

**All Rights Reserved (ARR).** No rights to use, modify, or redistribute this project are granted without prior written permission. See [LICENSE](LICENSE).
