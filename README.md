# GoalDiary

GoalDiary is an offline-first Android app intended to help people turn long-term goals into daily actions, record what they completed, and see their progress. Core features are planned to work locally without requiring an account or cloud service.

## Current phase

**Phase 1 — Android foundation.** This project currently provides the Compose app shell, Material 3 theme, five-tab navigation, a date-aware Home screen with clearly marked placeholders, and unit/UI test setup. Goal tracking, scheduling, records, and settings are not implemented yet; no sample or persistent user data is shown.

## Technology

- Kotlin with Android Gradle Plugin built-in Kotlin support
- Jetpack Compose and Material 3
- Navigation Compose
- Gradle Kotlin DSL and a version catalog
- JUnit 4 and Compose UI testing

## Build and run

Open this directory in a compatible Android Studio installation, install JDK 17, Android SDK Platform 37, and Android SDK Build-Tools 36.0.0, and allow Gradle to sync. Then run the `app` configuration on an API 26+ emulator or device. The project targets API 36 and compiles against API 37. The Wrapper downloads Gradle 9.4.1 on first use, so internet access is needed for that initial download and for resolving uncached dependencies.

On Windows, from this directory, use the checked-in Gradle Wrapper. A globally installed Gradle distribution is not required:

```powershell
.\gradlew.bat :app:assembleDebug
```

The debug APK is written to `app/build/outputs/apk/debug/`.

## Tests

Run JVM unit tests with:

```powershell
.\gradlew.bat :app:testDebugUnitTest
```

With an emulator or device connected, run the Compose navigation test with:

```powershell
.\gradlew.bat :app:connectedDebugAndroidTest
```

The Compose navigation test requires Android SDK Platform 37, Android SDK Build-Tools 36.0.0, platform tools/ADB, and a running API 26+ emulator or connected device. Gradle itself runs using JDK 17; Android Studio's bundled JDK 17 can be selected if needed.

## Current limitations

- Goal, event, feedback, fitness, study, backup, LAN, and focus features are intentionally out of scope for Phase 1.
- Placeholder screens do not persist data.
- Room is not added until the data model is introduced in a later phase.
- Build and test tasks have not yet been run in the current environment. Configuration and Wrapper files are prepared, but actual build/test validation remains pending a machine with JDK 17 and Android SDK Platform 37 installed; instrumentation tests also need an emulator or device.
