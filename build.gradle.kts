group = "com.kentrino.dependency"
version = "0.0.1"

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.41"
    `java-library`
    maven
}

repositories {
    jcenter()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}
