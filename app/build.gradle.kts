@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    id("my-application-plugins-buildsrc")
    id("app-dependency")
}

android {
    namespace = "com.example.gradleconventionplugins"
}