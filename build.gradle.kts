plugins {
    kotlin("jvm") apply false
    kotlin("multiplatform") apply false
}

version = "0.0.1-DEV"


allprojects {
    group = "net.teaclient.anti"
    repositories {
        maven("https://repo.papermc.io/repository/maven-public/")
        google()
        mavenCentral()
    }
}