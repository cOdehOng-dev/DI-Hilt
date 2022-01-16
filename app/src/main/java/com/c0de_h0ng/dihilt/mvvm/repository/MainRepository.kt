package com.c0de_h0ng.dihilt.mvvm.repository

import com.c0de_h0ng.dihilt.api.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * Created by c0de_h0ng on 2021/10/02.
 */
class MainRepository @Inject constructor(
    private val apiService: ApiService
) {

    suspend fun getUser(id: Long) = withContext(Dispatchers.IO) {
        return@withContext apiService.getUser(id)
    }

}