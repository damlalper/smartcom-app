# CI/CD Pipeline Configuration

SmartCommerce uses **GitHub Actions** for Continuous Integration and Delivery. This ensures that every code change is verified before it is merged.

## Workflow: Android CI

**File**: `.github/workflows/android_ci.yml`

### Triggers
The pipeline is triggered on:
*   `push` to the `main` branch.
*   `pull_request` targeting the `main` branch.

### Jobs & Steps

#### 1. Build & Test
This job runs on an `ubuntu-latest` runner.

1.  **Checkout Code**: Uses `actions/checkout@v4`.
2.  **Setup Java**: Installs **JDK 17** (Temurin distribution).
3.  **Grant Permissions**: Makes `gradlew` executable.
4.  **Build Application**: Runs `./gradlew assembleDebug` to verify the app compiles without errors.
5.  **Run Unit Tests**: Runs `./gradlew testDebugUnitTest` to execute all local unit tests.

## Running Locally

You can replicate the CI steps locally using the following commands in the terminal:

```bash
# Verify Build
./gradlew assembleDebug

# Run Unit Tests
./gradlew testDebugUnitTest
```

## Future Improvements
*   **Lint Check**: Add `./gradlew lintDebug`.
*   **Release Build**: Automate signing and APK artifact generation.
*   **Firebase Distribution**: Auto-deploy to testers.
