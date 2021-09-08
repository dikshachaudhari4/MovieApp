package com.example.movieapp.data.api

import com.example.movieapp.data.vo.MovieDetails
import com.example.movieapp.data.vo.MovieResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TheMovieDBInterface {


    // https://api.themoviedb.org/3/movie/popular?api_key=2f4ca025670866e9aaaebd79d13c4908&page=1
    //https://api.themoviedb.org/3/movie/588228?api_key=2f4ca025670866e9aaaebd79d13c4908


    @GET("movie/popular")
    fun getPopularMovies(@Query("page") page: Int): Single<MovieResponse>

    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") id: Int): Single<MovieDetails>

}