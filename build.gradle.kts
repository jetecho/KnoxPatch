// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.3.1")
        classpath("dev.rikka.tools.refine:gradle-plugin:3.1.1")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jcenter.bintray.com")
    }
}

tasks.register("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}