plugins {
    java
    checkstyle
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

checkstyle {
    configFile = File(rootDir, "whatever/checkstyle.xml")
}