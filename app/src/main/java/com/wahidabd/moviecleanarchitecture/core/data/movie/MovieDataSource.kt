package com.wahidabd.moviecleanarchitecture.core.data.movie

import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.wahidabd.moviecleanarchitecture.core.data.ApiMovie
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MovieDataSource @Inject constructor(private val api: ApiMovie) {

    fun getListMovie() = Pager(
        config = PagingConfig(
            pageSize = 5,
            maxSize = 20,
            enablePlaceholders = false
        ), pagingSourceFactory = { MoviePagingSource(api) }
    ).flow

}