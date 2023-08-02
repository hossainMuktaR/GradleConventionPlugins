import gradle.kotlin.dsl.accessors._6a0c069f232b417d63fc18ab53630648.androidTestImplementation
import gradle.kotlin.dsl.accessors._6a0c069f232b417d63fc18ab53630648.debugImplementation
import gradle.kotlin.dsl.accessors._6a0c069f232b417d63fc18ab53630648.implementation
import gradle.kotlin.dsl.accessors._6a0c069f232b417d63fc18ab53630648.testImplementation
import org.gradle.kotlin.dsl.dependencies

internal val Project.libs: VersionCatalog get() =
    project.extensions.getByType<VersionCatalogsExtension>().named("libs")


dependencies {
    implementation(libs.findLibrary("core.ktx").get())
    implementation(libs.findLibrary("lifecycle.runtime.ktx").get())
    implementation(platform(libs.findLibrary("compose.bom").get()))
    implementation(libs.findLibrary("activity.compose").get())
    implementation(libs.findLibrary("ui").get())
    implementation(libs.findLibrary("ui.graphics").get())
    implementation(libs.findLibrary("ui.tooling.preview").get())
    implementation(libs.findLibrary("material3").get())
    testImplementation(libs.findLibrary("junit").get())
    androidTestImplementation(libs.findLibrary("espresso.core").get())
    androidTestImplementation(libs.findLibrary("ui.test.junit4").get())
    androidTestImplementation(libs.findLibrary("androidx.test.ext.junit").get())
    androidTestImplementation(platform(libs.findLibrary("compose.bom").get()))
    debugImplementation(libs.findLibrary("ui.tooling").get())
    debugImplementation(libs.findLibrary("ui.test.manifest").get())
}