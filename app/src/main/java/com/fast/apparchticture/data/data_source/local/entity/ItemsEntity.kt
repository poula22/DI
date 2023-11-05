package com.fast.apparchticture.data.data_source.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ItemsEntity (@PrimaryKey val id:Int,val name:String)