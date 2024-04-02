plugins {
    alias(libs.plugins.sample.android.library)
}

android {
    namespace = "com.mathislaurent.kwizzy.ui"

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
}

dependencies {
    implementation(project(":domain"))
    // Hilt
    implementation(libs.hilt.compose)

    // Android
    implementation(libs.android.core)
    implementation(libs.android.lifecycle)

    // Compose
    implementation(platform(libs.compose.bom))
    implementation(libs.compose.activity)
    implementation(libs.bundles.compose.bom)
    implementation(libs.compose.runtime)
    implementation(libs.compose.viewmodel)
    implementation(libs.compose.ui.tooling)
}