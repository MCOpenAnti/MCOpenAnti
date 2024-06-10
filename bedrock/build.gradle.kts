import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile

plugins {
    kotlin("multiplatform")
}

version = "${properties["net.teaclient.version"]}-bedrock"

kotlin {
    js {
        nodejs {
            testTask {
                enabled = false;
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

dependencies {
//    implementation(npm("react", "> 14.0.0 <=16.9.0"))
}