package com.ilyes.ilyesmovies.movieList.data.remote.respnod




/**
 * @author Ilyes Moussaoui
 */
data class MovieListDto(
    val page: Int,
    val results: List<MovieDto>,
    val total_pages: Int,
    val total_results: Int
)