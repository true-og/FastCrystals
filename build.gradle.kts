import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id("java")
    eclipse
    id("com.github.johnrengelman.shadow") version "8.1.1" apply false
}

group = "xyz.exyron.fastcrystals"
version = "1.0"

subprojects {
    pluginManager.withPlugin("com.github.johnrengelman.shadow") {
        tasks.named<ShadowJar>("shadowJar") {
            archiveFileName.set("${rootProject.name}-${rootProject.version}.jar")
            destinationDirectory.set(file("${rootProject.projectDir}/build/libs"))
            relocate("org.bstats", "xyz.exyron.fastcrystals.bstats")
        }
    }
}

