plugins {
    kotlin("jvm")
}

version = "${properties["net.teaclient.version"]}-paper"


base {
    archivesName.set(properties["net.teaclient.archives.base.name"].toString())
}
