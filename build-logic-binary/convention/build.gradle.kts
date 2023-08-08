plugins {
    `kotlin-dsl`
}

group = "com.example.convention"

dependencies {
    compileOnly(libs.gradle)
    compileOnly(libs.kotlin.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "org.example.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("appDependencies") {
            id = "org.example.app.dependencies"
            implementationClass = "DependenciesConventionPlugin"
        }
    }
}