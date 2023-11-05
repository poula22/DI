package com.fast.apparchticture.data.data_source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.fast.apparchticture.data.data_source.local.dao.ItemsDao
import com.fast.apparchticture.data.data_source.local.entity.ItemsEntity

@Database([ItemsEntity::class], version = 1)
abstract class LocalDatabase:RoomDatabase() {
    abstract fun itemsDao():ItemsDao
}