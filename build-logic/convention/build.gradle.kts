plugins {
    `kotlin-dsl`
    alias(libs.plugins.org.jetbrains.kotlin.jvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly(libs.android.tools.build.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)
}

gradlePlugin {
    /**
     * Register convention plugins so they are available in the build scripts of the application
     */
    plugins {
        register("sampleAndroidApplication") {
            id = "sample.android.application"
            implementationClass = "com.mathislaurent.convention.AndroidApplicationConventionPlugin"
        }
        register("sampleAndroidLibrary") {
            id = "sample.android.library"
            implementationClass = "com.mathislaurent.convention.AndroidLibraryConventionPlugin"
        }
    }
}