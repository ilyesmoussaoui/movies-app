package com.ilyes.ilyesmovies.movieList.data.remote

import com.ilyes.ilyesmovies.movieList.data.remote.respnod.MovieListDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


/**
 * @author Ilyes Moussaoui
 */
interface MovieApi {
    @GET("movie/{category}")
    suspend fun getMoviesList(
        @Path("category") category: String,
        @Query("page") page: Int,
        @Query("api_key") apiKey: String = API_KEY
    ):MovieListDto
    companion object {
        const val BASE_URL = "https://api.themoviedb.org/3/"
        const val IMAGE_BASE_URL = "https://image.tmdb.org/t/p/w500"
        const val API_KEY = "83303a1fc05f748f62b0c9265de9d01c"
    }
}