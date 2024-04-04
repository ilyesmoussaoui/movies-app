package com.ilyes.ilyesmovies.di

import com.ilyes.ilyesmovies.movieList.data.repository.MovieListRepositoryImp
import com.ilyes.ilyesmovies.movieList.domain.repository.MovieListRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @author Ilyes Moussaoui
 */
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMovieListRepository(
        movieListRepositoryImpl: MovieListRepositoryImp
    ): MovieListRepository

}












