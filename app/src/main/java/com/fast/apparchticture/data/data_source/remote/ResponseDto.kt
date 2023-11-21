package com.fast.apparchticture.data.data_source.remote

import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class ResponseDto(

	@field:SerializedName("activity")
	val activity: String? = null,

	@field:SerializedName("accessibility")
	val accessibility: Any? = null,

	@field:SerializedName("price")
	val price: Any? = null,

	@field:SerializedName("link")
	val link: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("key")
	val key: String? = null,

	@field:SerializedName("participants")
	val participants: Int? = null
)
