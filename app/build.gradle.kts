plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
  //  id("de.mannodermaus.android-junit5")
}
androidExtensions {
    isExperimental = true
}
android {
    compileSdkVersion(AndroidSdk.compile)
    defaultConfig {
        applicationId("com.stylingandroid.time")
        minSdkVersion(AndroidSdk.min)
        targetSdkVersion(AndroidSdk.target)
        versionCode = 1
        versionName = "1.0"
        vectorDrawables.useSupportLibrary = true
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        testInstrumentationRunnerArgument("runnerBuilder", "de.mannodermaus.junit5.AndroidJUnit5Builder")
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
        isCoreLibraryDesugaringEnabled = true
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures.viewBinding = true
    packagingOptions {
        exclude("META-INF/LICENSE*")
    }
}

dependencies {
    implementation(Libraries.kotlinStdLib)
    implementation(Libraries.appCompat)
    implementation(Libraries.ktxCore)
    implementation(Libraries.constraintLayout)
    coreLibraryDesugaring(Libraries.coreLibraryDesugaring)

    androidTestImplementation("androidx.test:runner:1.2.0")
    // (Required) Writing and executing Unit Tests on the JUnit Platform
    androidTestImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0-M1")
    androidTestImplementation("de.mannodermaus.junit5:android-test-core:1.2.0")
    androidTestRuntimeOnly("de.mannodermaus.junit5:android-test-runner:1.2.0")
}
