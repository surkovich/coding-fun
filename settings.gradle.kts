
pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
        maven("https://central.sonatype.com/repository/maven-snapshots")

    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
        maven("https://central.sonatype.com/repository/maven-snapshots")
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
//    id("io.kotest") version "6.1.1"
}
rootProject.name = "coding-fun"
