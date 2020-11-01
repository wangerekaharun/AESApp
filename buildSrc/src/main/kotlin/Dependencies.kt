object Versions {
    //Version code and name for the application
    const val name = "1.0"
    const val code = 1

    //Version codes for all the libraries
    const val kotlin = "1.4.10"
    const val buildToolsVersion = "4.1.0"
    const val appCompat = "1.3.0-alpha02"
    const val constraintLayout = "2.0.4"
    const val ktx = "1.5.0-alpha04"
    const val material = "1.3.0-alpha03"

    //Version codes for all the test libraries
    const val junit4 = "4.13.1"
    const val testRunner = "1.3.1-alpha02"
    const val espresso = "3.4.0-alpha02"
    const val annotation = "1.2.0-alpha01"

    // Gradle Plugins
    const val ktlint = "9.4.1"
    const val detekt = "1.14.2"
    const val dokka = "1.4.10.2"
    const val gradleVersionsPlugin = "0.33.0"

    // Navigation
    const val navigation = "2.3.1"
}

object BuildPlugins {
    //All the build plugins are added here
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val androidLibrary = "com.android.library"
    const val ktlintPlugin = "org.jlleitschuh.gradle.ktlint"
    const val detektPlugin = "io.gitlab.arturbosch.detekt"
    const val dokkaPlugin = "org.jetbrains.dokka"
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "org.jetbrains.kotlin.android"
    const val kotlinAndroidExtensions = "org.jetbrains.kotlin.android.extensions"
    const val gradleVersionsPlugin = "com.github.ben-manes.versions"
}

object Libraries {
    //Any Library is added here
    const val kotlinStandardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
    const val materialComponents = "com.google.android.material:material:${Versions.material}"
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
}

object AndroidSDK {
    //minimum, compile and target SDK versions
    const val min = 21
    const val compile = 30
    const val target = compile
}

object TestLibraries {
    //any test library is added here
    const val junit4 = "junit:junit:${Versions.junit4}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val annotation = "androidx.annotation:annotation:${Versions.annotation}"
}

object BuildModules {
    const val app = ":app"
}