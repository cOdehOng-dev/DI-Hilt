package com.c0de_h0ng.dihilt.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.c0de_h0ng.dihilt.R
import com.c0de_h0ng.dihilt.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    private lateinit var dataBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //유저의 값이 변경될 경우
        viewModel.user.observe(this) {
            Toast.makeText(this, it.name, Toast.LENGTH_SHORT).show()
        }

        dataBinding.searchButton.setOnClickListener {
            viewModel.userApi(3422)
        }

    }
}