package com.example.moviesapp.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Movie : Serializable {
    @SerializedName("vote_count")
    var voteCount = 0

    @JvmField
    @SerializedName("id")
    var id = 0

    @SerializedName("video")
    var isVideo = false

    @JvmField
    @SerializedName("vote_average")
    var voteAverage = 0.0

    @JvmField
    @SerializedName("title")
    var title: String? = null

    @SerializedName("popularity")
    var popularity = 0.0

    @JvmField
    @SerializedName("poster_path")
    var posterPath: String? = null

    @SerializedName("original_language")
    var originalLanguage: String? = null

    @SerializedName("original_title")
    var originalTitle: String? = null

    @SerializedName("genre_ids")
    var genreId: List<Int>? = null

    @SerializedName("backdrop_path")
    var backdropPath: String? = null

    @SerializedName("adult")
    var isAdult = false

    @JvmField
    @SerializedName("overview")
    var overview: String? = null

    @JvmField
    @SerializedName("release_date")
    var releaseDate: String? = null

}