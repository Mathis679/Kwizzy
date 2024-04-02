plugins {
    alias(libs.plugins.sample.android.library)
}

android {
    namespace = "com.mathislaurent.kwizzy.domain"
}

dependencies {
    implementation(project(":core"))
    implementation(project(":data"))
}