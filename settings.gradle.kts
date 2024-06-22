
pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        mavenLocal()
    }

    plugins {
        kotlin("jvm") version "2.0.0"
        kotlin("multiplatform") version "2.0.0"
    }
}


include("common", "paper", "bedrock")
