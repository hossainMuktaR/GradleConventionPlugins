plugins {
    `kotlin-dsl`
}

group = "com.example.convention"

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
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