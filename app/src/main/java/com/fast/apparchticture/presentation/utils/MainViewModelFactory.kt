package com.fast.apparchticture.presentation.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.fast.apparchticture.domain.repo.ItemsRepository
import com.fast.apparchticture.presentation.MainViewModel

class MainViewModelFactory(private val itemsRepository: ItemsRepository) :ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(
            itemsRepository
        ) as T
    }
}