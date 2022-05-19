package me.sean.light

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class LightApplication

fun main(args: Array<String>) {
    runApplication<RoomApplication>(*args)
}
