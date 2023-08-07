package com.example.recipewithkim.retrofit

import com.example.recipewithkim.pojo.MealList
import retrofit2.Call
import retrofit2.http.GET

interface MealApi {
    @GET("Random.php")
    fun getRandomMeal():Call<MealList>
}