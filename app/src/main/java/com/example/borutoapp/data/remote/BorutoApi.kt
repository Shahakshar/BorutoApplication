package com.example.borutoapp.data.remote

import com.example.borutoapp.domain.model.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface BorutoApi {

    // getting heroes
    @GET("/boruto/heroes")
    suspend fun getAllHeroes(
        @Query("page") page: Int = 1
    ): ApiResponse

    // getting searchable heroes only
    @GET("/boruto/heroes/search")
    suspend fun searchableHeroes(
        @Query("name") name: String
    ): ApiResponse

}