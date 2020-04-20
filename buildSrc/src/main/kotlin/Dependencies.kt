const val kotlinVersion = "1.3.71"

object BuildPlugins {
    object Version {
        const val androidBuildToolsVersion = "4.1.0-alpha06"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Version.androidBuildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"

    const val detekt = "io.gitlab.arturbosch.detekt"
    const val ktlint = "org.jlleitschuh.gradle.ktlint"
    const val versions = "com.github.ben-manes.versions"
}

object AndroidSdk {
    const val min = 24
    const val compile = 29
    const val target = compile
}


object Libraries {
    private object Versions {
        const val appCompat = "1.2.0-beta01"
        const val ktx = "1.3.0-beta01"
        const val constraintLayout = "2.0.0-beta4"
        const val vectorDrawable = "1.1.0"
        const val coreLibraryDesugaring = "1.0.5"
    }

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val vectorDrawable = "androidx.vectordrawable:vectordrawable:${Versions.vectorDrawable}"
    const val animatedVectorDrawable = "androidx.vectordrawable:vectordrawable-animated:${Versions.vectorDrawable}"
    const val coreLibraryDesugaring = "com.android.tools:desugar_jdk_libs:${Versions.coreLibraryDesugaring}"
}
