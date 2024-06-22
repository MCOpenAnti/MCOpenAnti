import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile

plugins {
    kotlin("multiplatform")
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
                implementation(npm("@minecraft/server", "latest"))
            }
        }
    }
}


tasks.withType<KotlinJsCompile>().configureEach {
    compilerOptions {
        target = "es2015"
    }
}
