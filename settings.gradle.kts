pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "SmartCommerce"
include(":app")

// Core Modules
include(":core:ui")
include(":core:design-system")
include(":core:network")
include(":core:security")
include(":core:common")

// Feature Modules
include(":feature-auth")
include(":feature-home")
include(":feature-product")
include(":feature-cart")
include(":feature-checkout")
include(":feature-profile")

// Data & Domain
include(":data")
include(":domain")
