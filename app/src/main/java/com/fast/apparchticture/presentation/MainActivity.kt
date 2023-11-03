package com.fast.apparchticture.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fast.apparchticture.MyApplication
import com.fast.apparchticture.R
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val mainViewModel:MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}