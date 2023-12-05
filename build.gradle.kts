import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.6.7"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.9.21"
    kotlin("plugin.spring") version "1.9.21"
}

group = "me.sean"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17


allprojects {
    repositories {
        mavenCentral()
        maven {
            url = uri("https://repo.spring.io/release")
        }
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "17"
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}

subprojects {
    apply {
        plugin("java")
        plugin("kotlin")
        plugin("org.springframework.boot")
        plugin("io.spring.dependency-management")
    }

    dependencies {
        implementation("org.springframework.boot:spring-boot-starter")
        implementation(kotlin("stdlib"))
        implementation(kotlin("reflect"))

        implementation("org.springframework.boot:spring-boot-starter-webflux")
        implementation("org.springframework.boot:spring-boot-starter-actuator")
        implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-server")
        implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
        val mongoVersion = "3.12.11"
        implementation("org.mongodb:mongodb-driver:$mongoVersion")
        implementation("org.mongodb:mongo-java-driver:$mongoVersion")
        testImplementation("junit", "junit", "4.12")
        testImplementation("org.springframework.boot:spring-boot-starter-test")
    }

    dependencyManagement {
        imports { mavenBom("org.springframework.boot:spring-boot-dependencies:2.6.7") }
        imports { mavenBom("org.springframework.cloud:spring-cloud-dependencies:2021.0.2") }
    }
}
