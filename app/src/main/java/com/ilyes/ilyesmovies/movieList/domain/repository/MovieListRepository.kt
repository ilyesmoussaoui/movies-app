package com.ilyes.ilyesmovies.movieList.domain.repository

import com.ilyes.ilyesmovies.movieList.domain.model.Movie
import com.ilyes.ilyesmovies.movieList.util.Resource
import kotlinx.coroutines.flow.Flow

interface MovieListRepository {
    suspend fun getMovieList(
        forceFetchFromRemote: Boolean,
        category: String,
        page: Int
    ): Flow<Resource<List<Movie>>>
    suspend fun getMovie(id: Int): Flow<Resource<Movie>>
}