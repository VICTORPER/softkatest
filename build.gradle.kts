plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("com.intuit.karate:karate-junit5:1.2.0.RC4")
    testImplementation("net.masterthought:cucumber-reporting:5.7.0")
}

tasks.test {
    useJUnitPlatform()
    outputs.upToDateWhen { true }
}

sourceSets{
    test{resources{
        srcDir(file("src/test/java"))
        exclude("**/*.java")
    }

    }
}