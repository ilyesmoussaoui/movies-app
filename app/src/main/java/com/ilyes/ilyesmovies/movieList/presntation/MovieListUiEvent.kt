package com.ilyes.ilyesmovies.movieList.presntation

/**
 * @author Ilyes Moussaoui
 */
sealed interface MovieListUiEvent {
    data class Paginate(val category: String) : MovieListUiEvent
    object Navigate : MovieListUiEvent
}