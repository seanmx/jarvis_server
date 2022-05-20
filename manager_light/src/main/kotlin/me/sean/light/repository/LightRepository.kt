package me.sean.light.repository

import me.sean.light.dto.Light
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Created by Sean on 2022/5/19.
 *
 * light repository
 */
interface LightRepository : MongoRepository<Light, String> {
}