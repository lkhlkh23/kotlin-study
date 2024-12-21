plugins {
  kotlin("jvm") version "1.9.0"
  id("org.jlleitschuh.gradle.ktlint") version "11.3.2"
  application
}

group = "study"
version = "0.0.1"

repositories {
  mavenCentral()
}

dependencies {
  testImplementation(kotlin("test"))
}

tasks.test {
  useJUnitPlatform()
}

kotlin {
  jvmToolchain(8)
}

application {
  mainClass.set("ApplicationKt")
}
