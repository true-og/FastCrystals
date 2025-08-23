plugins {
    id("java")
}

repositories {
    mavenCentral()
    maven { url = uri("https://repo.codemc.org/repository/nms/") }
}

dependencies {
    compileOnly("org.spigotmc:spigot:1.16.5-R0.1-SNAPSHOT")
}

