package com.example.sectortracker

sealed class StockListState {
    object Loading : StockListState()
    data class Success(val stocks: List<com.example.sectortracker.data.model.Stock>) : StockListState()
    data class Error(val message: String) : StockListState()
    object Empty : StockListState()
}