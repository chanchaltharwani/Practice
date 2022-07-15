package com.example.practice.apiautozon

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class AutoLoginResponseModel(

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: UserDetails? = null,

	@field:SerializedName("authStatus")
	val authStatus: String? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: String? = null
) : Parcelable

@Parcelize
data class UserDetails(

	@field:SerializedName("p_user_address")
	val pUserAddress: String? = null,

	@field:SerializedName("p_user_bank")
	val pUserBank: String? = null,

	@field:SerializedName("p_user_new_topic_alert")
	val pUserNewTopicAlert: Int? = null,

	@field:SerializedName("p_user_mobile")
	val pUserMobile: String? = null,

	@field:SerializedName("p_user_iban_code")
	val pUserIbanCode: String? = null,

	@field:SerializedName("p_user_new_post_alert")
	val pUserNewPostAlert: Int? = null,

	@field:SerializedName("p_user_mobile_country")
	val pUserMobileCountry: String? = null,

	@field:SerializedName("p_user_account_type")
	val pUserAccountType: Int? = null,

	@field:SerializedName("p_user_status")
	val pUserStatus: Int? = null,

	@field:SerializedName("p_user_created_on")
	val pUserCreatedOn: String? = null,

	@field:SerializedName("p_user_tax_registration_code")
	val pUserTaxRegistrationCode: String? = null,

	@field:SerializedName("p_user_lastlogin")
	val pUserLastlogin: String? = null,

	@field:SerializedName("p_user_photo")
	val pUserPhoto: String? = null,

	@field:SerializedName("p_user_city")
	val pUserCity: Int? = null,

	@field:SerializedName("p_user_email")
	val pUserEmail: String? = null,

	@field:SerializedName("p_user_nr_reg_com")
	val pUserNrRegCom: String? = null,

	@field:SerializedName("p_user_optimized_type")
	val pUserOptimizedType: Int? = null,

	@field:SerializedName("p_user_company_name")
	val pUserCompanyName: String? = null,

	@field:SerializedName("p_user_name")
	val pUserName: String? = null,

	@field:SerializedName("p_user_id")
	val pUserId: Int? = null,

	@field:SerializedName("p_user_headquarters_address")
	val pUserHeadquartersAddress: String? = null
) : Parcelable

//@Parcelize
//data class Data(
//
//	@field:SerializedName("userDetails")
//	val userDetails: UserDetails? = null,
//
//	@field:SerializedName("token")
//	val token: String? = null
//) : Parcelable
