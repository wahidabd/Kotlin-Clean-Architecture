package com.wahidabd.moviecleanarchitecture.core.data

import com.wahidabd.moviecleanarchitecture.core.data.movie.dto.MovieMeta
import com.wahidabd.moviecleanarchitecture.utils.Constant.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiMovie {

    @GET("discover/movie?api_key=$API_KEY")
    fun getMovie(
        @Query("page") page: Int
    ): MovieMeta

}