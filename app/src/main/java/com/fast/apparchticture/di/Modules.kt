package com.fast.apparchticture.di

import android.content.Context
import android.content.SharedPreferences
import com.fast.apparchticture.data.data_source.local.LocalDataSourceImp
import com.fast.apparchticture.data.data_source.local.LocalDatabase
import com.fast.apparchticture.data.data_source.remote.ApiManagerImp
import com.fast.apparchticture.data.data_source.remote.RemoteDataSourceImp
import com.fast.apparchticture.data.repo.ItemsRepositoryImp
import com.fast.apparchticture.domain.data_source.ApiManager
import com.fast.apparchticture.domain.data_source.LocalDataSource
import com.fast.apparchticture.domain.data_source.RemoteDataSource
import com.fast.apparchticture.domain.repo.ItemsRepository
import com.fast.apparchticture.presentation.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


fun provideSharedPref(context: Context): SharedPreferences =
    context.getSharedPreferences("app", Context.MODE_PRIVATE)

fun provideApiManager(): ApiManager = ApiManagerImp()
fun provideRemoteDataSource(apiManager: ApiManager) = RemoteDataSourceImp(apiManager)

fun provideLocalDataSource(): LocalDataSource = LocalDataSourceImp()

fun provideItemsRepository(
    localDataSource: LocalDataSource,
    remoteDataSource: RemoteDataSource
): ItemsRepository =
    ItemsRepositoryImp(localDataSource = localDataSource, remoteDataSource = remoteDataSource)

val appModule = module {
    single { provideSharedPref(androidContext()) }
    single { provideApiManager() }
    single { LocalDatabase() }
}

val dataSourceModules= module {
    single { provideLocalDataSource() }
    single { provideRemoteDataSource(apiManager = get()) }
}

val repoModules= module {
    single {
        provideItemsRepository(localDataSource = get(), remoteDataSource = get())
    }
}

val viewModels = module {
    viewModel { MainViewModel(itemsRepo = get()) }
}