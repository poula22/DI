package com.fast.apparchticture.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fast.apparchticture.domain.repo.ItemsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val itemsRepo:ItemsRepository):ViewModel() {
    fun fetchData():Flow<String> = flow{
            emit(itemsRepo.fetchData())
    }

}