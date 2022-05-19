package me.sean.room.dto

import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.MongoId

/**
 * Created by Sean on 2022/5/19.
 *
 * Room
 */
@Document(collection = "rooms")
data class Room(@MongoId val id: String, val name: String, val desc: String)
