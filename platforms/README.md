# Platform build modules

This directory documents the intended split between loader-specific projects.

- **Forge** — current, build-verified baseline lives at the repository root for Minecraft 1.20.1.
- **Fabric** — add a Fabric Loom project and Fabric API event adapter for each target marked scaffold-only.
- **NeoForge** — add a NeoGradle/ModDevGradle project and NeoForge event adapter for each target marked scaffold-only.

The target catalog under `targets/<version>/<loader>/` is the inventory, not a substitute for Gradle files or a release jar. A target must not be advertised as available until its own project compiles and has been tested in-game.
