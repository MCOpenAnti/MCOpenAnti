plugins {
    java
    kotlin("jvm")
    id("io.papermc.paperweight.userdev") version "1.7.1"
    id("xyz.jpenilla.run-paper") version "2.3.0"
    id("xyz.jpenilla.resource-factory-bukkit-convention") version "1.1.1"
    id("io.github.goooler.shadow") version "8.1.7"
}

description = properties["net.teaclient.description"].toString()
version = "${properties["net.teaclient.version"]}-paper"
paperweight.reobfArtifactConfiguration = io.papermc.paperweight.userdev.ReobfArtifactConfiguration.MOJANG_PRODUCTION // No Spigot Support

base {
    archivesName.set(properties["net.teaclient.archives.base.name"].toString())
}

dependencies {
    implementation("io.papermc.paper:paper-api:1.21-R0.1-SNAPSHOT")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:2.0.0")
    paperweight.paperDevBundle("1.21-R0.1-SNAPSHOT")
    implementation("org.incendo:cloud-paper:2.0.0-beta.8")

}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

tasks.jar {
    manifest {
        attributes["paperweight-mappings-namespace"] = "mojang"
    }
}


tasks {
    shadowJar {
        fun reloc(pkg: String) = relocate(pkg, "net.teaclient.anti.dependency.$pkg")
        reloc("org.incendo.cloud")
        reloc("io.leangen.geantyref")
        manifest {
            attributes["paperweight-mappings-namespace"] = "mojang"
        }
    }

    compileJava {
        options.release = 21
    }

    jar {
        manifest {
            attributes["paperweight-mappings-namespace"] = "mojang"
        }
    }

    runServer {
        minecraftVersion("1.21")
    }
}



bukkitPluginYaml {
    name = "TeaCLientAnti"
    main = "net.teaclient.anti.Plugin"
    author = "TeaClientMC"
    website = "https://teaclient.net"
    apiVersion = "1.20.1"
    commands {
        register("TeaClientAnti") {
            description = "TeaClientAntiCheat Settings"
            usage = "TeaClientAnti <sub-command>"
            permission = "permission.node"
            aliases = listOf("settings")
        }
    }
}