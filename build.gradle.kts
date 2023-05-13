plugins {
    kotlin("jvm") version "1.8.21"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.3"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.withType<Test>() {
    useJUnitPlatform()
    forkEvery = 1
    gradleEnterprise {
        buildScan {
            value("forkEvery", forkEvery.toString())
        }
    }
}


