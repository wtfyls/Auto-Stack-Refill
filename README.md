# Auto Stack Refill

A Minecraft inventory quality-of-life mod that refills your selected hotbar slot from a matching stack in your inventory when the held stack runs out.

## Project goals

- Minecraft Java Edition **1.20.1 through 26.3**
- Target loaders: **Forge, Fabric, and NeoForge**
- Server-aware refill behavior
- Version- and loader-specific builds, named so players can select the correct jar
- **All Rights Reserved (ARR)** license

## Current build status

The repository currently has one build-verified target: **Minecraft 1.20.1 + Forge**. Its GitHub Actions build passed, but the refill behavior still needs an in-game test. The rest of the version/loader combinations are listed as **scaffold only**; they are not yet working builds or published downloads.

Do not assume a target is available merely because it appears in the matrix. A target becomes build-verified only after its loader-specific project builds in CI; a release should be marked available only after runtime testing.

See [SUPPORT_MATRIX.md](SUPPORT_MATRIX.md) for the full target list and status, or open [the target folders](targets/) for per-combination notes.

## Target Minecraft versions

The catalog covers these Java Edition releases:

- **1.20.x:** 1.20.1, 1.20.2, 1.20.3, 1.20.4, 1.20.5, 1.20.6
- **1.21.x:** 1.21, 1.21.1, 1.21.2, 1.21.3, 1.21.4, 1.21.5, 1.21.6, 1.21.7, 1.21.8, 1.21.9, 1.21.10, 1.21.11
- **26.x:** 26.1, 26.1.1, 26.1.2, 26.2, 26.3

Each version has a target entry for Forge, Fabric, and NeoForge. Loader availability, dependency versions, and build success must still be checked per target; not every loader uses the same API or build configuration.

## Building the current verified project

Requirements: Java 17 and Gradle 8.8 (CI installs Gradle).

```bash
gradle build
```

The jar is created in `build/libs/`.

## Contributing

See [SUPPORT_MATRIX.md](SUPPORT_MATRIX.md) for target status. See [CONTRIBUTING.md](CONTRIBUTING.md) before adding a loader/version port.

## License

All Rights Reserved (ARR). No rights to use, modify, or redistribute the project are granted without prior written permission. See [LICENSE](LICENSE).
