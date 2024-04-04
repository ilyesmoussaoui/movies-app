package com.ilyes.ilyesmovies.movieList.presntation

import com.ilyes.ilyesmovies.movieList.domain.model.Movie


/**
 * @author ILYES Moussaoui
 */
data class MovieListState(
    val isLoading: Boolean = false,

    val popularMovieListPage: Int = 1,
    val upcomingMovieListPage: Int = 1,

    val isCurrentPopularScreen: Boolean = true,

    val popularMovieList: List<Movie> = emptyList(),
    val upcomingMovieList: List<Movie> = emptyList()
)