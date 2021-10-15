package com.wahidabd.moviecleanarchitecture.di

import com.wahidabd.moviecleanarchitecture.core.domain.LoginInteractor
import com.wahidabd.moviecleanarchitecture.core.domain.LoginUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class AppUseCase {

    @Binds
    @ViewModelScoped
    abstract fun provideLoginUseCase(interactor: LoginInteractor): LoginUseCase

}