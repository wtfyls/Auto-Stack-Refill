# Auto Stack Refill

A Minecraft inventory quality-of-life mod that refills your selected hotbar slot from a matching stack in your inventory when that slot's stack runs out.

## Minecraft versions and loaders

This repository targets only these Minecraft Java Edition versions:

**1.20.1 · 1.21.1 · 1.21.11 · 26.1 · 26.1.1 · 26.2 · 26.3**

Loaders in scope: **Forge, Fabric, and NeoForge**.

See [the version support table](SUPPORT_MATRIX.md) for build status. At the moment, only Forge 1.20.1 has passed CI compilation; the other loader/version targets are not built releases yet.

## Build the current Forge 1.20.1 target

Requirements: Java 17 and Gradle 8.8.

```bash
gradle build
```

The mod jar is produced in `build/libs/`.

## Project layout

- `src/main/` — current Forge 1.20.1 implementation
- `targets/<version>/<loader>/` — per-version and per-loader status and notes
- `support/minecraft-versions.json` — canonical target list
- `SUPPORT_MATRIX.md` — compact loader support table
- `platforms/README.md` — notes for loader-specific ports

## License

**All Rights Reserved (ARR).** No rights to use, modify, or redistribute the project are granted without prior written permission. See [LICENSE](LICENSE).
