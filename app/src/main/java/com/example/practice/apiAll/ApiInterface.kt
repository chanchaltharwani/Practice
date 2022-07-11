package com.example.practice.apiAll

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


//url for top headlines
//https://newsapi.org/v2/top-headlines?country=in&apiKey=API_KEY
//url for all news
//https://newsapi.org/v2/everything?q=tesla&from=2021-12-19&sortBy=publishedAt&apiKey=API_KEY


const val BASE_URL = "https://newsapi.org/"  //common in all end points
const val API_KEY = "9417543b8a8c46edb9b62ed2ddad049e"//api key k liye constant variable


//1st step
interface ApiInterface {

    //all function will be declared in thisn interface
    //2nd step function bnana
    @GET("v2/top-headlines?apikey=$API_KEY")//jab call hoga to end point or key chiye hogi
    fun getHeadlines(@Query("country") country:String, @Query("page") page:Int):Call<News> //call back
    //https://newsapi.org/v2/top-headlines?apikey=$API_KEY&country=in&page=1

    }

//3rd step object bnana
object NewsService{
    //ek refernece bnaya h interface ka
    val newsInstance :ApiInterface
    init {
        //retrofit object
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)  //define base url
            .addConverterFactory(GsonConverterFactory.create())//defin
            .build()
        newsInstance = retrofit.create(ApiInterface::class.java)

    }


}