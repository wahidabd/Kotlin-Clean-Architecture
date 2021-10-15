package com.wahidabd.moviecleanarchitecture.core.domain

import com.wahidabd.moviecleanarchitecture.core.data.dto.LoginRequest
import com.wahidabd.moviecleanarchitecture.core.data.dto.LoginResponse
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

class LoginInteractor @Inject constructor(private val repo: LoginRepositoryImpl): LoginUseCase {
    override fun login(req: LoginRequest): Flow<LoginResponse> {
        return repo.login(req)
    }
}