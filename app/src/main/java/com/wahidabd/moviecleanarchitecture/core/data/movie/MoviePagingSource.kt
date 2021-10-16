package com.wahidabd.moviecleanarchitecture.core.data.movie

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.wahidabd.moviecleanarchitecture.core.data.ApiMovie
import com.wahidabd.moviecleanarchitecture.core.data.movie.dto.MovieResponse
import com.wahidabd.moviecleanarchitecture.utils.Constant.START_PAGE_INDEX
import retrofit2.HttpException
import java.io.IOException

class MoviePagingSource(
    private val api: ApiMovie
) : PagingSource<Int, MovieResponse>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, MovieResponse> {
        return try {
            val position = params.key ?: START_PAGE_INDEX
            val response = api.getMovie(position)
            val movies = response.results

            LoadResult.Page(
                data = movies,
                prevKey = if (position == START_PAGE_INDEX) null else position-1,
                nextKey = if (movies.isEmpty()) null else position+1
            )
        }catch (e: IOException){
            LoadResult.Error(e)
        }catch (e: HttpException){
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, MovieResponse>): Int? {
        TODO("Not yet implemented")
    }
}