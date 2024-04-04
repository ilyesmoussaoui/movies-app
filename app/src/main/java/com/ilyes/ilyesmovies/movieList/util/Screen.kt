package com.ilyes.ilyesmovies.movieList.util

/**
 * @author Ilyes Moussaoui
 */
sealed class Screen(val rout: String) {
    object Home : Screen("main")
    object PopularMovieList : Screen("popularMovie")
    object UpcomingMovieList : Screen("upcomingMovie")
    object Details : Screen("details")
}
