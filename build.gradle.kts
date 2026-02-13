plugins {
    kotlin("jvm") version "2.3.0"

}

group = "org.marmotta"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://central.sonatype.com/repository/maven-snapshots/")

}



dependencies {
    testImplementation(kotlin("test"))

//    testImplementation("io.kotest:kotest-runner-junit5:6.0")
//    testImplementation("io.kotest:kotest-assertions-core:6.0")

//    implementation("io.kotest:io.kotest.gradle.plugin:6.1.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

kotlin {
    jvmToolchain(23)
}

tasks.test {
    useJUnitPlatform()
}