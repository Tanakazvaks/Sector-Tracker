package com.example.sectortracker

import com.example.sectortracker.data.model.MarketstackStock
import com.example.sectortracker.data.model.StockResponse
import com.example.sectortracker.data.network.ApiService

class FakeApiService : ApiService {

    var stocks: List<MarketstackStock> = emptyList()
    var shouldThrowError: Boolean = false

    override suspend fun getStocks(accessKey: String, symbols: String): StockResponse {
        if (shouldThrowError) throw Exception("Fake API error")
        return StockResponse(data = stocks)
    }
}
