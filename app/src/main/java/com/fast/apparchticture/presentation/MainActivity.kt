package com.fast.apparchticture.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.fast.apparchticture.MyApplication
import com.fast.apparchticture.R
import com.fast.apparchticture.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    val mainViewModel:MainViewModel by lazy { ViewModelProvider(this)[MainViewModel::class.java] }
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this, R.layout.activity_main
        )
        binding.btnMessage.setOnClickListener{
            subscribeToData()
        }
    }

    private fun subscribeToData() {
        lifecycleScope.launch {
            mainViewModel.fetchData().collectLatest{
                val view=binding.root
                AlertDialog.Builder(view.context)
                    .setMessage(it)
                    .setPositiveButton("OK"){ dialog,which-> }
                    .create()
                    .show()
            }
        }
    }
}