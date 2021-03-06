package com.sal3awy.movieapp.module.movielist.presentation.uimodel


data class MovieUiModel(
    val favIconResId:Int,
    var posterPath: String? = null,
    var adult: Boolean? = null,
    var overview: String? = null,
    var releaseDate: String? = null,
    var genreIds: ArrayList<Int> = arrayListOf(),
    var id: Int? = null,
    var originalTitle: String? = null,
    var originalLanguage: String? = null,
    var title: String? = null,
    var backdropPath: String? = null,
    var popularity: Double? = null,
    var voteCount: Int? = null,
    var video: Boolean? = null,
    var voteAverage: Double? = null
)