package com.example.practice.apiautozon

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SellAutozonResponseModel(

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
data class Dataaa(

	@field:SerializedName("records")
	val records: List<RecordsItem?>? = null
) : Parcelable

@Parcelize
data class RecordsItem(

	@field:SerializedName("company_type")
	val companyType: Int? = null,

	@field:SerializedName("p_user_new_topic_alert")
	val pUserNewTopicAlert: Int? = null,

	@field:SerializedName("category_name")
	val categoryName: String? = null,

	@field:SerializedName("company_updated_at")
	val companyUpdatedAt: String? = null,

	@field:SerializedName("p_user_mobile")
	val pUserMobile: String? = null,

	@field:SerializedName("p_user_iban_code")
	val pUserIbanCode: String? = null,

	@field:SerializedName("p_user_new_post_alert")
	val pUserNewPostAlert: Int? = null,

	@field:SerializedName("product_image")
	val productImage: String? = null,

	@field:SerializedName("company_address_street")
	val companyAddressStreet: String? = null,

	@field:SerializedName("subcategory_name")
	val subcategoryName: String? = null,

	@field:SerializedName("category_status")
	val categoryStatus: Int? = null,

	@field:SerializedName("product_price")
	val productPrice: String? = null,

	@field:SerializedName("product_user_id")
	val productUserId: Int? = null,

	@field:SerializedName("p_user_otp")
	val pUserOtp: String? = null,

	@field:SerializedName("product_tags")
	val productTags: String? = null,

	@field:SerializedName("subcategory_id")
	val subcategoryId: Int? = null,

	@field:SerializedName("p_user_created_on")
	val pUserCreatedOn: String? = null,

	@field:SerializedName("p_user_tax_registration_code")
	val pUserTaxRegistrationCode: String? = null,

	@field:SerializedName("product_subcategory")
	val productSubcategory: Int? = null,

	@field:SerializedName("p_user_lastlogin")
	val pUserLastlogin: String? = null,

	@field:SerializedName("company_logo")
	val companyLogo: String? = null,

	@field:SerializedName("company_contact_person_required")
	val companyContactPersonRequired: Int? = null,

	@field:SerializedName("company_address_other")
	val companyAddressOther: String? = null,

	@field:SerializedName("product_id")
	val productId: Int? = null,

	@field:SerializedName("company_created_at")
	val companyCreatedAt: String? = null,

	@field:SerializedName("color_image")
	val colorImage: String? = null,

	@field:SerializedName("subcategory_image")
	val subcategoryImage: String? = null,

	@field:SerializedName("company_postal")
	val companyPostal: String? = null,

	@field:SerializedName("product_model")
	val productModel: String? = null,

	@field:SerializedName("product_display_home")
	val productDisplayHome: String? = null,

	@field:SerializedName("p_user_bank")
	val pUserBank: String? = null,

	@field:SerializedName("company_slides")
	val companySlides: String? = null,

	@field:SerializedName("p_user_account_type")
	val pUserAccountType: Int? = null,

	@field:SerializedName("product_color")
	val productColor: String? = null,

	@field:SerializedName("category_updated_at")
	val categoryUpdatedAt: String? = null,

	@field:SerializedName("company_fiscal")
	val companyFiscal: String? = null,

	@field:SerializedName("product_slides")
	val productSlides: String? = null,

	@field:SerializedName("product_name")
	val productName: String? = null,

	@field:SerializedName("company_user_id")
	val companyUserId: Int? = null,

	@field:SerializedName("company_views")
	val companyViews: Int? = null,

	@field:SerializedName("product_updated_at")
	val productUpdatedAt: String? = null,

	@field:SerializedName("company_name")
	val companyName: String? = null,

	@field:SerializedName("category_created_at")
	val categoryCreatedAt: String? = null,

	@field:SerializedName("color_name")
	val colorName: String? = null,

	@field:SerializedName("product_details")
	val productDetails: String? = null,

	@field:SerializedName("p_user_address")
	val pUserAddress: String? = null,

	@field:SerializedName("product_key_features")
	val productKeyFeatures: String? = null,

	@field:SerializedName("color_status")
	val colorStatus: String? = null,

	@field:SerializedName("company_website")
	val companyWebsite: String? = null,

	@field:SerializedName("product_status")
	val productStatus: Int? = null,

	@field:SerializedName("company_trade")
	val companyTrade: String? = null,

	@field:SerializedName("product_created_at")
	val productCreatedAt: String? = null,

	@field:SerializedName("color_created_at")
	val colorCreatedAt: String? = null,

	@field:SerializedName("subcategory_status")
	val subcategoryStatus: Int? = null,

	@field:SerializedName("subcategory_display_home")
	val subcategoryDisplayHome: String? = null,

	@field:SerializedName("category_image")
	val categoryImage: String? = null,

	@field:SerializedName("p_user_status")
	val pUserStatus: Int? = null,

	@field:SerializedName("product_offer_price")
	val productOfferPrice: String? = null,

	@field:SerializedName("category_id")
	val categoryId: Int? = null,

	@field:SerializedName("p_user_photo")
	val pUserPhoto: String? = null,

	@field:SerializedName("p_user_city")
	val pUserCity: Int? = null,

	@field:SerializedName("company_lng")
	val companyLng: String? = null,

	@field:SerializedName("p_user_nr_reg_com")
	val pUserNrRegCom: String? = null,

	@field:SerializedName("p_user_optimized_type")
	val pUserOptimizedType: Int? = null,

	@field:SerializedName("company_city")
	val companyCity: Int? = null,

	@field:SerializedName("color_updated_at")
	val colorUpdatedAt: String? = null,

	@field:SerializedName("p_user_password")
	val pUserPassword: String? = null,

	@field:SerializedName("company_status")
	val companyStatus: Int? = null,

	@field:SerializedName("product_views")
	val productViews: Int? = null,

	@field:SerializedName("category_display_home")
	val categoryDisplayHome: Int? = null,

	@field:SerializedName("p_user_updated_on")
	val pUserUpdatedOn: String? = null,

	@field:SerializedName("product_discount")
	val productDiscount: String? = null,

	@field:SerializedName("company_id")
	val companyId: Int? = null,

	@field:SerializedName("p_user_mobile_country")
	val pUserMobileCountry: String? = null,

	@field:SerializedName("subcategory_created_at")
	val subcategoryCreatedAt: String? = null,

	@field:SerializedName("company_lat")
	val companyLat: String? = null,

	@field:SerializedName("company_address_street_no")
	val companyAddressStreetNo: String? = null,

	@field:SerializedName("subcategory_parent")
	val subcategoryParent: Int? = null,

	@field:SerializedName("product_type")
	val productType: Int? = null,

	@field:SerializedName("color_id")
	val colorId: String? = null,

	@field:SerializedName("company_description")
	val companyDescription: String? = null,

	@field:SerializedName("p_user_email")
	val pUserEmail: String? = null,

	@field:SerializedName("p_user_company_name")
	val pUserCompanyName: String? = null,

	@field:SerializedName("p_user_name")
	val pUserName: String? = null,

	@field:SerializedName("product_qty")
	val productQty: Int? = null,

	@field:SerializedName("subcategory_updated_at")
	val subcategoryUpdatedAt: String? = null,

	@field:SerializedName("color_display_home")
	val colorDisplayHome: String? = null,

	@field:SerializedName("p_user_id")
	val pUserId: Int? = null,

	@field:SerializedName("p_user_headquarters_address")
	val pUserHeadquartersAddress: String? = null
) : Parcelable
