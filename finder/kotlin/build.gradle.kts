plugins {
    id("kotlinx-serialization") version "1.3.40"
    `build-scan` 
    kotlin("jvm") version "1.3.40" 
}

repositories {
    jcenter() 
}

dependencies {
    implementation(kotlin("stdlib")) 
    implementation ("org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.11.1")
    testImplementation("junit:junit:4.12")
}

buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service" 
    termsOfServiceAgree = "yes"

    publishAlways() 
}
