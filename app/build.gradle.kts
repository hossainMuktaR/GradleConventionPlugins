@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    id("org.example.android.application")
    id("org.example.app.dependencies")
}

android {
    namespace = "com.example.gradleconventionplugins"

    defaultConfig {
        applicationId = "com.example.gradleconventionplugins"
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

}