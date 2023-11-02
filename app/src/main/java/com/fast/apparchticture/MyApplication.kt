package com.fast.apparchticture

import android.app.Application
import com.fast.apparchticture.core.AppContainer
import com.fast.apparchticture.presentation.utils.MainViewModelFactory

class MyApplication:Application() {
    val appContainer=AppContainer()
    val viewModelFactory=MainViewModelFactory(appContainer.itemsRepository)
}