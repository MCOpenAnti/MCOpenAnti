plugins {
    kotlin("jvm") version "1.9.23"
    id("maven-publish")
}

version = "0.0.1-DEV"


allprojects {
    group = "net.teaclient.anti"
    repositories {
        maven("https://jitpack.io") {
            name = "Jitpack"
        }
        mavenCentral()
    }
}