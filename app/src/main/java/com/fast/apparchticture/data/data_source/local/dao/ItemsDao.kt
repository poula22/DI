package com.fast.apparchticture.data.data_source.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.fast.apparchticture.data.data_source.local.entity.ItemsEntity

@Dao
interface ItemsDao {
    @Query("SELECT * from itemsEntity")
    fun getItems():List<ItemsEntity>

    @Insert
    fun insertItem(itemsEntity: ItemsEntity)
}