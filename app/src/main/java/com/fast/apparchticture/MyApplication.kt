package com.fast.apparchticture

import android.app.Application
import com.fast.apparchticture.di.appModule
import com.fast.apparchticture.di.dataSourceModules
import com.fast.apparchticture.di.repoModules
import com.fast.apparchticture.di.viewModels
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.logger.Level

class MyApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            // Log Koin into Android logger
            androidLogger(Level.NONE)
            // Reference Android context
            androidContext(this@MyApplication)

            modules(listOf(appModule, dataSourceModules, repoModules, viewModels))
        }
    }
}