package me.sean.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication(exclude = [MongoAutoConfiguration::class])
@EnableDiscoveryClient
@EnableEurekaClient
open class GatewayApplication

fun main(args: Array<String>) {
    runApplication<GatewayApplication>(*args)
}
