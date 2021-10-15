package com.wahidabd.moviecleanarchitecture.core

import com.wahidabd.moviecleanarchitecture.core.data.dto.LoginMeta
import com.wahidabd.moviecleanarchitecture.core.data.dto.LoginRequest
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Headers
import retrofit2.http.POST

interface Api {

    @POST("login")
    suspend fun login(
        @Body request: LoginRequest
    ): LoginMeta

}