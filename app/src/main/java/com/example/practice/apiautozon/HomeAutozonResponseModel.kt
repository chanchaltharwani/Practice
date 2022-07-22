package com.example.practice.apiautozon

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class HomeAutozonResponseModel(

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: Data? = null,

	@field:SerializedName("authStatus")
	val authStatus: Boolean? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: String? = null
) : Parcelable

@Parcelize
data class SubcatgoryItem(

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("value")
	val value: String? = null
) : Parcelable

@Parcelize
data class Data(

	@field:SerializedName("categories")
	val categories: List<CategoriesItem?>? = null,

	@field:SerializedName("brand")
	val brand: List<BrandItem?>? = null
) : Parcelable

@Parcelize
data class VehicleItem(

	@field:SerializedName("vehicle_brand")
	val vehicleBrand: Int? = null,

	@field:SerializedName("vehicle_display_home")
	val vehicleDisplayHome: String? = null,

	@field:SerializedName("vehicle_status")
	val vehicleStatus: Int? = null,

	@field:SerializedName("vehicle_created_at")
	val vehicleCreatedAt: String? = null,

	@field:SerializedName("vehicle_id")
	val vehicleId: Int? = null,

	@field:SerializedName("vehicle_image")
	val vehicleImage: String? = null,

	@field:SerializedName("vehicle_updated_at")
	val vehicleUpdatedAt: String? = null,

	@field:SerializedName("vehicle_name")
	val vehicleName: String? = null
) : Parcelable

@Parcelize
data class CategoriesItem(

	@field:SerializedName("category_display_home")
	val categoryDisplayHome: Int? = null,

	@field:SerializedName("category_image")
	val categoryImage: String? = null,

	@field:SerializedName("category_name")
	val categoryName: String? = null,

	@field:SerializedName("category_id")
	val categoryId: Int? = null,

	@field:SerializedName("category_created_at")
	val categoryCreatedAt: String? = null,

	@field:SerializedName("category_status")
	val categoryStatus: Int? = null,

	@field:SerializedName("category_updated_at")
	val categoryUpdatedAt: String? = null,

	@field:SerializedName("subcatgory")
	val subcatgory: List<SubcatgoryItem?>? = null
) : Parcelable

@Parcelize
data class BrandItem(

	@field:SerializedName("brand_image")
	val brandImage: String? = null,

	@field:SerializedName("brand_updated_at")
	val brandUpdatedAt: String? = null,

	@field:SerializedName("brand_name")
	val brandName: String? = null,

	@field:SerializedName("brand_display_home")
	val brandDisplayHome: String? = null,

	@field:SerializedName("brand_created_at")
	val brandCreatedAt: String? = null,

	@field:SerializedName("brand_status")
	val brandStatus: Int? = null,

	@field:SerializedName("brand_id")
	val brandId: Int? = null,

	@field:SerializedName("vehicle")
	val vehicle: List<VehicleItem?>? = null
) : Parcelable
