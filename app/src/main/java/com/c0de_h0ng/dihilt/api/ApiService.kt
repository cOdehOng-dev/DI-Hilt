package com.c0de_h0ng.dihilt.api

import com.c0de_h0ng.dihilt.ui.User
import retrofit2.http.GET

/**
 * Created by c0de_h0ng on 2021/10/02.
 */
interface ApiService {

    @GET("user")
    fun getUser(id: Long): User
}