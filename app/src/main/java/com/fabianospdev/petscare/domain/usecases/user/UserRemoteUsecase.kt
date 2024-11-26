package com.fabianospdev.petscare.domain.usecases.user

import com.fabianospdev.petscare.data.models.user.remote.RemoteUserModel
import retrofit2.Response

interface UserRemoteUsecase  {

    suspend fun getUser(name: String, password: String): Result<Response<RemoteUserModel>>
}
