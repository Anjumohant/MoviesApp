package com.example.moviesapp.network

import com.example.moviesapp.model.MoviePageResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GetMovieDataService {
    @GET("movie/now_playing")
    fun getNowPlayingMovies(@Query("page") page: Int, @Query("api_key") userkey: String?, @Query("language") language: String?): Call<MoviePageResult?>?
}