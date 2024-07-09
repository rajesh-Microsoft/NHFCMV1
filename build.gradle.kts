plugins {
    alias(libs.plugins.android.application) apply false
}
//buildscript {
//    dependencies {
//        classpath(libs.google.services) // Add this line
//    }
//}

buildscript {
    dependencies {
    // ... other dependencies
    classpath(libs.google.services) // Replace with the latest version
    }
}