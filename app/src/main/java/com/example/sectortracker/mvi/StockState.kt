package com.example.sectortracker.mvi

import com.example.sectortracker.StockListState
import com.example.sectortracker.data.model.Stock

data class StockState(
    val selectedStock: Stock? = null,
    val error: Exception? = null,
    val stockListState: StockListState = StockListState.Loading,
    val stocks: List<Stock>? = null
)