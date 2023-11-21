package com.fast.apparchticture.di

import com.fast.apparchticture.data.data_source.local.LocalDataSourceImp
import com.fast.apparchticture.data.data_source.remote.ApiManagerImp
import com.fast.apparchticture.data.data_source.remote.RemoteDataSourceImp
import com.fast.apparchticture.data.repo.ItemsRepositoryImp
import com.fast.apparchticture.domain.data_source.ApiManager
import com.fast.apparchticture.domain.data_source.LocalDataSource
import com.fast.apparchticture.domain.data_source.RemoteDataSource
import com.fast.apparchticture.domain.repo.ItemsRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {
    @Binds
    @Singleton
    abstract fun provideApiManager(apiManager: ApiManagerImp):ApiManager

    @Binds
    @Singleton
    abstract fun provideLocalDataSource(localDataSource: LocalDataSourceImp):LocalDataSource

    @Binds
    @Singleton
    abstract fun provideRemoteDataSource(remoteDataSource: RemoteDataSourceImp): RemoteDataSource

    @Binds
    @Singleton
    abstract fun provideItemsRepository(itemsRepository: ItemsRepositoryImp): ItemsRepository


}