package com.wahidabd.moviecleanarchitecture.core.data.movie.dto


data class MovieMeta(
    val page: Int,
    val total_pages: Int,
    val total_results: Int,
    val results: List<MovieResponse>
)

data class MovieResponse(
    val id: Int? = null,
    val title: String? = null,
    val overview: String? = null,
    val poster_path: String? = null,
    val backdrop_path: String? = null,
    val release_date: String? = null
)