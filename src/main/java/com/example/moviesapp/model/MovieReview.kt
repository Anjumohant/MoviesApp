package com.example.moviesapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class MovieReview : Serializable {
    @JvmField
    @SerializedName("author")
    @Expose
    var author: String? = null
    @JvmField
    @SerializedName("content")
    @Expose
    var content: String? = null

    @SerializedName("id")
    @Expose
    var id: String? = null

    @SerializedName("url")
    @Expose
    var url: String? = null

}