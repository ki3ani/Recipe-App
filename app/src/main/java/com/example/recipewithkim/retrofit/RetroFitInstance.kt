package com.example.recipewithkim.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroFitInstance {


    val api:MealApi by lazy {
        Retrofit.Builder()
            .baseUrl("www.themealdb.com/api/json/v1/1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MealApi::class.java)


    }

}
