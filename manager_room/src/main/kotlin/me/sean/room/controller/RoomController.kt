package me.sean.room.controller

import me.sean.room.dto.Room
import me.sean.room.repository.RoomRepository
import me.sean.room.service.RoomService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * Created by Sean on 2022/5/19.
 *
 * room controller
 */
@RestController
@RequestMapping(value = ["/room"])
class RoomController {
    @Autowired
    lateinit var roomService: RoomService

    @GetMapping("/rooms", produces = ["application/json"])
    fun getAllRooms(): List<Room> = roomService.getAllRooms()

    @PostMapping("/rooms")
    fun addRoom(@RequestBody vararg room: Room) {
        roomService.addRoom(*room)
    }

    @DeleteMapping("/rooms/{roomId}")
    fun removeRoom(@PathVariable roomId: String) {
        roomService.deleteRoom(roomId)
    }
}