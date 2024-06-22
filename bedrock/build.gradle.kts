plugins {
    id("org.jetbrains.kotlin.js") version "2.0.0"
    id("maven-publish")
}

version = "${properties["net.teaclient.version"]}-bedrock"

kotlin {
    js(IR) {
        nodejs {
            testTask {
                useMocha()
            }
        }
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(project(":common"))
                implementation(npm("@minecraft/server", "latest"))
            }
        }
}
}


