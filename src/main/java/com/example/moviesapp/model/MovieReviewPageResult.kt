package com.example.moviesapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class MovieReviewPageResult : Serializable {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("page")
    @Expose
    var page: Int? = null
    @JvmField
    @SerializedName("results")
    @Expose
    var results: ArrayList<MovieReview>? = null

    @SerializedName("total_pages")
    @Expose
    var totalPages: Int? = null

    @SerializedName("total_results")
    @Expose
    var totalResults: Int? = null

}