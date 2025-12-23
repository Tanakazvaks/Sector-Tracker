package com.example.sectortracker.data.network

import com.example.sectortracker.data.model.StockResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("eod/latest")
    suspend fun getStocks(
        @Query("access_key") accessKey: String = "8301d96e44e4191d8f7ff31e32c9c5d8",
        @Query("symbols") symbols: String = "AAPL,MSFT,JPM,GS,AMZN,TSLA,NFLX,GOOGL"
    ): StockResponse
}

val apiService: ApiService = Retrofit.Builder()
    .baseUrl("https://api.marketstack.com/v2/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()
    .create(ApiService::class.java)
