plugins {
    alias(libs.plugins.sample.android.library)
}

android {
    namespace = "com.mathislaurent.kwizzy.data"
}

dependencies {
    implementation(project(":core"))
}