package com.wahidabd.moviecleanarchitecture.core.data.dto

data class LoginMeta(
    val is_success: Boolean,
    val message: String,
    val data: LoginResponse
)

data class LoginResponse(
    val access_token: String,
    val token_type: String,
    val user: UserResponse
)

data class UserResponse(
    val id: Int,
    val email: String,
    val username: String
)