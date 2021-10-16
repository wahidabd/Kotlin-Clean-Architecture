package com.wahidabd.moviecleanarchitecture.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.wahidabd.moviecleanarchitecture.core.data.user.dto.LoginRequest
import com.wahidabd.moviecleanarchitecture.core.data.user.dto.LoginResponse
import com.wahidabd.moviecleanarchitecture.core.domain.LoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val use: LoginUseCase): ViewModel() {

    fun login(req: LoginRequest): LiveData<LoginResponse> = use.login(req).asLiveData()

}