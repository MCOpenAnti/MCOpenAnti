import org.jetbrains.kotlin.gradle.dsl.JsModuleKind
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
        binaries.executable()
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(npm("@minecraft/server", "1.12.0-beta.1.21.1-stable"))
            }
        }
    }
}


tasks.withType<KotlinJsCompile>().configureEach {
    compilerOptions {
        sourceMap = false
        moduleKind = JsModuleKind.MODULE_ES
        moduleName = "AntiCheat"
    }
    doLast {
        println("Renaming .mjs files to .js (${layout.buildDirectory.get()})")
        val oldOutputDir = file("${layout.buildDirectory.get()}\\compileSync\\js\\main\\productionExecutable\\kotlin")
        val mjsFiles = oldOutputDir.listFiles { dir, name -> name.endsWith(".mjs") }
        val newOutputDir = file("${layout.buildDirectory.get()}\\out")
        val scriptsDir = file("${newOutputDir.path}\\scripts")
        if (newOutputDir.exists().not())
            newOutputDir.mkdirs()
        else {
            newOutputDir.deleteRecursively()
            newOutputDir.mkdirs()
        }

        scriptsDir.mkdirs()
        file("${layout.buildDirectory.get()}\\processedResources\\js\\main").copyRecursively(newOutputDir)

        mjsFiles?.forEach { mjsFile ->
            println("Renaming ${mjsFile.name} to ${mjsFile.nameWithoutExtension}.js")
            val newJsFile = File(scriptsDir, mjsFile.nameWithoutExtension + ".js")
            newJsFile.writeText(mjsFile.readText().replace(".mjs", ".js"))
            mjsFile.delete()
        }
        file("${layout.buildDirectory.get()}\\compileSync").deleteRecursively()
        println("Done building!")
    }
}


