import com.example.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class DependenciesConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            dependencies {
                add("implementation",libs.findLibrary("core.ktx").get())
                add("implementation",libs.findLibrary("lifecycle.runtime.ktx").get())
                add("implementation",platform(libs.findLibrary("compose.bom").get()))
                add("implementation",libs.findLibrary("activity.compose").get())
                add("implementation",libs.findLibrary("ui").get())
                add("implementation",libs.findLibrary("ui.graphics").get())
                add("implementation",libs.findLibrary("ui.tooling.preview").get())
                add("implementation",libs.findLibrary("material3").get())
                add("testImplementation",libs.findLibrary("junit").get())
                add("androidTestImplementation",libs.findLibrary("espresso.core").get())
                add("androidTestImplementation",libs.findLibrary("ui.test.junit4").get())
                add("androidTestImplementation",libs.findLibrary("androidx.test.ext.junit").get())
                add("androidTestImplementation",platform(libs.findLibrary("compose.bom").get()))
                add("debugImplementation",libs.findLibrary("ui.tooling").get())
                add("debugImplementation",libs.findLibrary("ui.test.manifest").get())
            }
        }
    }

}