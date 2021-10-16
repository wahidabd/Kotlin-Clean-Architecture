package com.wahidabd.moviecleanarchitecture.core

import com.wahidabd.moviecleanarchitecture.core.data.user.dto.LoginMeta
import com.wahidabd.moviecleanarchitecture.core.data.user.dto.LoginRequest
import retrofit2.http.Body
import retrofit2.http.POST

interface Api {

    @POST("login")
    suspend fun login(
        @Body request: LoginRequest
    ): LoginMeta

}