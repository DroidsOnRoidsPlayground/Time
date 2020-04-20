plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
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
}

dependencies {
    implementation(Libraries.kotlinStdLib)
    implementation(Libraries.appCompat)
    implementation(Libraries.ktxCore)
    implementation(Libraries.constraintLayout)
    coreLibraryDesugaring(Libraries.coreLibraryDesugaring)

    androidTestImplementation("junit:junit:4.13")
    androidTestImplementation("androidx.test:runner:1.2.0")
}
