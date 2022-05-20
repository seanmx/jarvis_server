package me.sean.light.dto

import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.MongoId

/**
 * Created by Sean on 2022/5/19.
 *
 * Light
 */
@Document(collection = "lights")
data class Light(@MongoId val id: String, val name: String)
