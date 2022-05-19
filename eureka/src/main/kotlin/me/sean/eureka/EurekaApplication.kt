package me.sean.eureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication(exclude = [MongoAutoConfiguration::class])
@EnableEurekaServer
open class EurekaApplication

fun main(args: Array<String>) {
    runApplication<EurekaApplication>(*args)
}
