plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "8.1.1"
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
    maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots") }
    maven { url = uri("https://oss.sonatype.org/content/repositories/central") }
    maven { url = uri("https://repo.extendedclip.com/content/repositories/placeholderapi/") }
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.20.6-R0.1-SNAPSHOT")
    implementation("org.bstats:bstats-bukkit:3.0.2")
    compileOnly("me.clip:placeholderapi:2.11.6")

    implementation(project(":shared"))
    implementation(project(":v1_20_6"))
}

