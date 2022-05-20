package me.sean.light.controller

import me.sean.light.dto.Light
import me.sean.light.repository.LightRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Sean on 2022/5/19.
 *
 * light controller
 */
@RestController
@RequestMapping(value = ["light"])
class LightController {

    @Autowired
    lateinit var lightRepository: LightRepository

    /**
     * 获取所有灯
     */
    @GetMapping("/lights")
    fun getAllLights(): MutableList<Light> = lightRepository.findAll()
}