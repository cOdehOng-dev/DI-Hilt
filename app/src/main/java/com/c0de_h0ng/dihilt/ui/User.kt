package com.c0de_h0ng.dihilt.ui

import com.google.gson.annotations.SerializedName

/**
 * Created by c0de_h0ng on 2021/11/15.
 */
data class User(
    @SerializedName("name")
    val name: String
)