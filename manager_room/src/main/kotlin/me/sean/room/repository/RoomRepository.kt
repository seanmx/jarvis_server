package me.sean.room.repository

import me.sean.room.dto.Room
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Created by Sean on 2022/5/19.
 *
 * Room Repository
 */
interface RoomRepository : MongoRepository<Room, String> {
}