package com.wahidabd.moviecleanarchitecture.core.domain

import com.wahidabd.moviecleanarchitecture.core.data.user.dto.LoginRequest
import com.wahidabd.moviecleanarchitecture.core.data.user.dto.LoginResponse
import kotlinx.coroutines.flow.Flow

interface LoginUseCase {
    fun login(req: LoginRequest): Flow<LoginResponse>
}