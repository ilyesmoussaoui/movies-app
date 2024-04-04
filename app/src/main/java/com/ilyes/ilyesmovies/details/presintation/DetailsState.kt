package com.ilyes.ilyesmovies.details.presintation

import com.ilyes.ilyesmovies.movieList.domain.model.Movie


/**
 * @author Ilyes Moussaoui
 */
data class DetailsState(
    val isLoading: Boolean = false,
    val movie: Movie? = null
)
