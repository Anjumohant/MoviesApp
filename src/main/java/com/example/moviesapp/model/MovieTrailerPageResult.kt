package com.example.moviesapp.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class MovieTrailerPageResult : Serializable {
    @SerializedName("id")
    var id = 0
    @JvmField
    @SerializedName("results")
    var trailerResult: ArrayList<MovieTrailer>? = null

}