package com.wahidabd.moviecleanarchitecture.core.data.user

import android.util.Log
import com.wahidabd.moviecleanarchitecture.core.Api
import com.wahidabd.moviecleanarchitecture.core.data.user.dto.LoginRequest
import com.wahidabd.moviecleanarchitecture.core.data.user.dto.LoginResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RemoteDataSource @Inject constructor(private val api: Api) {

    fun login(req: LoginRequest): Flow<LoginResponse> = flow {
        try {
            val response = api.login(req)
            if (response.is_success){
                emit(response.data)
            }
        }catch (e: Exception){
            Log.e("Data Source ", e.message.toString())
        }
    }.flowOn(Dispatchers.IO)

}