package com.wahidabd.moviecleanarchitecture.core.domain

import com.wahidabd.moviecleanarchitecture.core.data.dto.LoginRequest
import com.wahidabd.moviecleanarchitecture.core.data.dto.LoginResponse
import kotlinx.coroutines.flow.Flow
import javax.inject.Singleton

interface LoginUseCase {
    fun login(req: LoginRequest): Flow<LoginResponse>
}