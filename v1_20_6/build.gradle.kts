plugins {
    id("java")
}

group = "xyz.exyron.fastcrystals"
version = "1.0"

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

repositories {
    mavenCentral()
    mavenLocal()
    maven { url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/") }
    maven { url = uri("https://repo.codemc.org/repository/nms/") }
}

dependencies {
    compileOnly("org.spigotmc:spigot:1.20.6-R0.1-SNAPSHOT")
    compileOnly("org.spigotmc:spigot-api:1.20.6-R0.1-SNAPSHOT")
    compileOnly(project(":shared"))
}

