package com.fast.apparchticture.core

import com.fast.apparchticture.data.repo.ItemsRepositoryImp
import com.fast.apparchticture.domain.repo.ItemsRepository


class AppContainer {
    val itemsRepository:ItemsRepository=ItemsRepositoryImp()
}