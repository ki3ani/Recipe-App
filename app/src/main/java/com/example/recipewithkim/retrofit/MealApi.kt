package com.example.recipewithkim.retrofit

import com.example.recipewithkim.pojo.CategoryList
import com.example.recipewithkim.pojo.MealList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MealApi {
    @GET("Random.php")
    fun getRandomMeal():Call<MealList>

    @GET("lookup.php?")
    fun getMealDetails(@Query("i") id:String) : Call<MealList>

    @GET("filter.php?")
    fun getPopularItems(@Query("c") categoryName:String) : Call<CategoryList>
}
