package com.wahidabd.moviecleanarchitecture.core.domain

import com.wahidabd.moviecleanarchitecture.core.data.dto.LoginRequest
import com.wahidabd.moviecleanarchitecture.core.data.dto.LoginResponse
import kotlinx.coroutines.flow.Flow

interface LoginRepositoryImpl {
    fun login(req: LoginRequest): Flow<LoginResponse>
}