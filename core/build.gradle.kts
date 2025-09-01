plugins {
    id("java")
    id("com.gradleup.shadow") version "8.3.6"
}

group = "xyz.exyron.fastcrystals"
version = "1.0"

repositories {
    mavenCentral()
    maven { url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/") }
    maven { url = uri("https://repo.codemc.org/repository/nms/") }
    maven { url = uri("https://repo.extendedclip.com/content/repositories/placeholderapi/") }
}

dependencies {
    compileOnly("org.spigotmc:spigot:1.16.5-R0.1-SNAPSHOT")
    implementation("org.bstats:bstats-bukkit:3.0.2")
    compileOnly("me.clip:placeholderapi:2.11.6")

    implementation(project(":shared"))
    implementation(project(":v1_16"))
    implementation(project(":v1_17"))
    implementation(project(":v1_18"))
    implementation(project(":v1_19"))
    implementation(project(":v1_19_3"))
    implementation(project(":v1_19_4"))
    implementation(project(":v1_20"))
    implementation(project(":v1_20_2"))
    implementation(project(":v1_20_4"))
}

