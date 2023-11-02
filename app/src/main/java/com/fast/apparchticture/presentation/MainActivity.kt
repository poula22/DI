package com.fast.apparchticture.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fast.apparchticture.MyApplication
import com.fast.apparchticture.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel:MainViewModel=(application as MyApplication).viewModelFactory.create(MainViewModel::class.java)
    }
}