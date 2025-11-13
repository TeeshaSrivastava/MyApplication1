pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "My Application"

include(":app")
include(":sdk")
project(":sdk").projectDir = File(rootDir, "third_party/OpenCV-android/sdk")
