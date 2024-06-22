plugins {
    kotlin("jvm") version "2.0.0"
    id("maven-publish")
}

version = "0.0.1-DEV"


allprojects {
    group = "net.teaclient.anti"
    repositories {
        maven("https://jitpack.io") {
            name = "Jitpack"
        }
        gradlePluginPortal()
        mavenCentral()
        mavenLocal()
    }
}