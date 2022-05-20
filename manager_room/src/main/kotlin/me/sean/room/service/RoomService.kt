package me.sean.room.service

import me.sean.room.dto.Room
import org.springframework.stereotype.Service

/**
 * Created by Sean on 2022/5/19.
 *
 * room service
 */
@Service
interface RoomService {
    /**
     * 添加房间
     */
    fun addRoom(vararg room: Room)

    /**
     * 获取所有房间
     */
    fun getAllRooms(): MutableList<Room>

    /**
     * 根据[id]删除房间
     */
    fun deleteRoom(id: String)
}