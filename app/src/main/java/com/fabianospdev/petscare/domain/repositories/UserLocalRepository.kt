package com.fabianospdev.petscare.domain.repositories

import com.fabianospdev.petscare.data.models.user.local.RoomUser

interface UserLocalRepository {
    suspend fun getLocalUser(name: String, password: String): RoomUser?
    suspend fun insertLocalUser(user: RoomUser)
    suspend fun updateLocalUser(user: RoomUser)
    suspend fun deleteLocalUser(user: RoomUser)
}