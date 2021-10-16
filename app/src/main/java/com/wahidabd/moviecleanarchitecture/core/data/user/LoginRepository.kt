package com.wahidabd.moviecleanarchitecture.core.data.user

import com.wahidabd.moviecleanarchitecture.core.data.user.dto.LoginRequest
import com.wahidabd.moviecleanarchitecture.core.data.user.dto.LoginResponse
import com.wahidabd.moviecleanarchitecture.core.domain.LoginRepositoryImpl
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LoginRepository @Inject constructor(private val data: RemoteDataSource): LoginRepositoryImpl {
    override fun login(req: LoginRequest): Flow<LoginResponse> {
        return data.login(req)
    }
}