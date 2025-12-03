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

## Note on "React Native"

The initial requirements mentioned "React Native" but also specified "Jetpack Compose", "Gradle Kotlin DSL", "Room", and "MVVM". These are native Android technologies and are incompatible with a standard React Native project structure. This project is built as a **Native Android App** to fulfill the majority of the specific technical requirements.

## Setup

1.  Open the project in Android Studio.
2.  Sync Gradle.
3.  Run on an emulator or device (API 24+).

## Features

*   **Widget:** A home screen widget to control music.
*   **App:** A Material 3 UI to manage the music list.
*   **Persistence:** Remembers progress and music list using Room.
