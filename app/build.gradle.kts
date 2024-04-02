plugins {
    alias(libs.plugins.sample.android.application)
}

android {
    namespace = "com.mathislaurent.kwizzy"

    defaultConfig {
        applicationId = "com.mathislaurent.kwizzy"
        versionCode = 1
        versionName = "1.0"

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(project(":core"))
    implementation(project(":domain"))
    implementation(project(":data"))
    implementation(project(":ui"))
}