# Version and loader support matrix

This is the complete **target matrix**, not a claim that every combination has been implemented or released. Status is tracked independently for every Minecraft-version/loader pair.

- **Build verified** — the Gradle build for this target has passed CI. Runtime behavior may still need testing.
- **Scaffold only** — the target is inventoried, but it does not yet have a complete loader-specific build and verified implementation.
- **Not published** — none of these targets has been tagged as a public mod release yet.

| Minecraft Java Edition | Java | Forge | Fabric | NeoForge |
|---|---:|---|---|---|
| 1.20.1 | 17 | Build verified* | Scaffold only | Scaffold only |
| 1.20.2 | 17 | Scaffold only | Scaffold only | Scaffold only |
| 1.20.3 | 17 | Scaffold only | Scaffold only | Scaffold only |
| 1.20.4 | 17 | Scaffold only | Scaffold only | Scaffold only |
| 1.20.5 | 21 | Scaffold only | Scaffold only | Scaffold only |
| 1.20.6 | 21 | Scaffold only | Scaffold only | Scaffold only |
| 1.21 | 21 | Scaffold only | Scaffold only | Scaffold only |
| 1.21.1 | 21 | Scaffold only | Scaffold only | Scaffold only |
| 1.21.2 | 21 | Scaffold only | Scaffold only | Scaffold only |
| 1.21.3 | 21 | Scaffold only | Scaffold only | Scaffold only |
| 1.21.4 | 21 | Scaffold only | Scaffold only | Scaffold only |
| 1.21.5 | 21 | Scaffold only | Scaffold only | Scaffold only |
| 1.21.6 | 21 | Scaffold only | Scaffold only | Scaffold only |
| 1.21.7 | 21 | Scaffold only | Scaffold only | Scaffold only |
| 1.21.8 | 21 | Scaffold only | Scaffold only | Scaffold only |
| 1.21.9 | 21 | Scaffold only | Scaffold only | Scaffold only |
| 1.21.10 | 21 | Scaffold only | Scaffold only | Scaffold only |
| 1.21.11 | 21 | Scaffold only | Scaffold only | Scaffold only |
| 26.1 | 25 | Scaffold only | Scaffold only | Scaffold only |
| 26.1.1 | 25 | Scaffold only | Scaffold only | Scaffold only |
| 26.1.2 | 25 | Scaffold only | Scaffold only | Scaffold only |
| 26.2 | 25 | Scaffold only | Scaffold only | Scaffold only |
| 26.3 | 25 | Scaffold only | Scaffold only | Scaffold only |

\* Forge 1.20.1 compiled successfully in GitHub Actions on October 26, 2026; in-game behavior remains untested.

## Release naming

Planned artifact naming convention:

`auto-stack-refill+mc<MINECRAFT_VERSION>-<LOADER>.jar`

Examples: `auto-stack-refill+mc1.20.1-forge.jar`, `auto-stack-refill+mc1.21.1-fabric.jar`, `auto-stack-refill+mc26.3-neoforge.jar`.

## Java runtime targets

- Minecraft 1.20.1–1.20.4: Java 17
- Minecraft 1.20.5–1.21.11: Java 21
- Minecraft 26.1–26.3: Java 25

These are runtime/compiler targets for the Minecraft version lines. The loader Gradle plugin version and dependency version must be pinned per target and checked against the official loader distribution for that Minecraft version.

## Important

A loader release existing for a Minecraft version does not automatically make this mod compatible with it. Each target requires its own dependency pins, API-compatible code, successful CI compilation, and runtime test. In particular, modern versions use changed item-stack/component APIs, and loader event APIs differ.
