package me.sean.room.controller

import me.sean.room.dto.Room
import me.sean.room.repository.RoomRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Sean on 2022/5/19.
 *
 * room controller
 */
@RestController
@RequestMapping(value = ["/room"])
class RoomController {
    @Autowired
    lateinit var roomRepository: RoomRepository

    @GetMapping("/rooms", produces = ["application/json"])
    fun getAllRooms(): MutableList<Room> = roomRepository.findAll()
}