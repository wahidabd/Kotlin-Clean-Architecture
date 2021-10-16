package com.wahidabd.moviecleanarchitecture.core.domain

import com.wahidabd.moviecleanarchitecture.core.data.user.dto.LoginRequest
import com.wahidabd.moviecleanarchitecture.core.data.user.dto.LoginResponse
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LoginInteractor @Inject constructor(private val repo: LoginRepositoryImpl): LoginUseCase {
    override fun login(req: LoginRequest): Flow<LoginResponse> {
        return repo.login(req)
    }
}