package com.c0de_h0ng.dihilt.ui

import androidx.lifecycle.ViewModel
import com.c0de_h0ng.dihilt.mvvm.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by c0de_h0ng on 2021/10/02.
 */
@HiltViewModel
class MainViewModel @Inject constructor(private val repository: MainRepository) : ViewModel() {

}