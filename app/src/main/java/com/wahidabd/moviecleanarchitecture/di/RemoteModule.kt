package com.wahidabd.moviecleanarchitecture.di

import com.wahidabd.moviecleanarchitecture.core.data.LoginRepository
import com.wahidabd.moviecleanarchitecture.core.domain.LoginRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [AppModule::class])
@InstallIn(SingletonComponent::class)
abstract class RemoteModule {

    @Binds
    abstract fun provideLogin(repo: LoginRepository): LoginRepositoryImpl
}