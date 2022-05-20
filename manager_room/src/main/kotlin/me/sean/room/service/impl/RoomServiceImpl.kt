package me.sean.room.service.impl

import me.sean.room.dto.Room
import me.sean.room.repository.RoomRepository
import me.sean.room.service.RoomService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 * Created by Sean on 2022/5/19.
 *
 * room service
 */
@Component
class RoomServiceImpl : RoomService {
    @Autowired
    lateinit var roomRepository: RoomRepository

    override fun addRoom(vararg room: Room) {
        roomRepository.insert(room.toMutableList())
    }

    override fun getAllRooms(): MutableList<Room> = roomRepository.findAll()

    override fun deleteRoom(id: String) {
        roomRepository.deleteById(id)
    }
}