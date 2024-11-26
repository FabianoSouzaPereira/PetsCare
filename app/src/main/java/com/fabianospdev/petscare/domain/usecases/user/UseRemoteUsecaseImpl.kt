package com.fabianospdev.petscare.domain.usecases.user

import com.fabianospdev.petscare.data.models.user.remote.RemoteUserModel
import com.fabianospdev.petscare.domain.repositories.UserRemoteRepository
import retrofit2.Response
import javax.inject.Inject

class UserRemoteUsecaseImpl @Inject constructor(
    private val userRemoteRepository: UserRemoteRepository
) : UserRemoteUsecase {

    override suspend fun getUser(name: String, password: String): Result<Response<RemoteUserModel>> {
        return userRemoteRepository.getUser(name, password)
    }
}
