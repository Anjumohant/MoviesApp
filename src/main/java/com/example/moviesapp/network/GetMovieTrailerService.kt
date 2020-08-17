package com.example.moviesapp.network

import com.example.moviesapp.model.MovieTrailerPageResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GetMovieTrailerService {
    @GET("movie/{id}/videos")
    fun getTrailers(@Path("id") movieId: Int, @Query("api_key") userkey: String?): Call<MovieTrailerPageResult?>?
}