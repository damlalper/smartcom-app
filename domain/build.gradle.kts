plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.smartcommerce.domain"
    compileSdk = 34

    defaultConfig {
        minSdk = 24
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.kotlinx.coroutines.android)
    // Domain should be pure, but we might need Coroutines.
    // Clean Architecture Strictness: Domain shouldn't have Android deps, 
    // but we used androidLibrary plugin for simplicity in setup. 
    // We will avoid using Android APIs in code.
    // Testing
    testImplementation(libs.mockk)
    testImplementation(libs.junit)
}
