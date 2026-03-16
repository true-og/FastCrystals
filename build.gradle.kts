import org.gradle.jvm.tasks.Jar
import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id("java")
    eclipse
    id("com.gradleup.shadow") version "8.3.9" apply false
}

group = "xyz.exyron.fastcrystals"
version = "1.0"

subprojects {
    pluginManager.withPlugin("com.gradleup.shadow") {
        tasks.named<ShadowJar>("shadowJar") {
            archiveFileName.set("${rootProject.name}--${rootProject.version}.jar")
            destinationDirectory.set(file("${rootProject.projectDir}/build/libs"))
        }
    }
}


tasks.named<Jar>("jar") {
    enabled = false
}

tasks.named("assemble") {
    dependsOn(":core:shadowJar")
}
