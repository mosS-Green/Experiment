# The Music Widget

An extremely beautiful music widget with seeking and playback controls.

## Tech Stack

*   **Language:** Kotlin
*   **UI Framework:** Jetpack Compose (Material 3)
*   **Architecture:** MVVM with Clean Architecture
*   **Local Storage:** Room Database
*   **Widget:** Jetpack Glance
*   **Build System:** Gradle (Kotlin DSL)
*   **CI/CD:** GitHub Actions

## Setup

1.  Open the project in Android Studio.
2.  **Important:** Run `gradle wrapper` in the terminal (or let Android Studio fix the Gradle wrapper) to generate the `gradlew` files and `gradle-wrapper.jar`. These binary files could not be generated automatically.
3.  Sync Gradle.
4.  Run on an emulator or device (API 24+).

## Features

*   **Widget:** A home screen widget to control music.
*   **App:** A Material 3 UI to manage the music list.
*   **Persistence:** Remembers progress and music list using Room.
