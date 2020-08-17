package com.example.moviesapp.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class MoviePageResult(@field:SerializedName("page") var page: Int, @field:SerializedName("total_results") var totalResults: Int, @field:SerializedName("total_pages") var totalPages: Int, @field:SerializedName("results") var movieResult: ArrayList<Movie>) : Serializable