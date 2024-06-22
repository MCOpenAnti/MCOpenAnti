
pluginManagement {
    repositories {
        maven("https://repo.papermc.io/repository/maven-public/") {
            name = "paperweight"
        }
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


/// Paper AntiCheat
include("paper")