# PortalPlus Connect

Android application for simplifying access to Wi-Fi captive portals.

## Stack

- Kotlin
- Jetpack Compose
- Material 3
- Android SDK
- Clean Architecture
- MVVM
- Coroutines
- Flow
- Gradle Kotlin DSL

## Goal

PortalPlus Connect automates the process of detecting Wi-Fi connectivity and captive portals, providing an extensible architecture for different portal providers.

## Supported Wi-Fi networks

- Entertainment
- PortalPlus

## Architecture

```
app/

core/
  network/
  wifi/
  captiveportal/

data/
domain/
ui/
di/
```

## Roadmap

### Sprint 0

✅ Completed

- Repository creation
- Initial configuration
- Android gitignore

### Sprint 1

🚧 In progress

Foundation of the Android application:

- Gradle Kotlin DSL setup
- Compose Material 3 foundation
- MainActivity
- Application structure
- Initial UI
- GitHub Actions build pipeline

### Future sprints

- Network monitoring
- Captive portal detection
- Provider based authentication

## Development

Changes are organized in small reviewable commits.
