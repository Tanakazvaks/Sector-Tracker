package com.example.sectortracker.mvi

import com.example.sectortracker.data.model.Stock

sealed class StockAction {
    data class SelectedStock(val stock: Stock?) : StockAction()
    object FetchListOfStock : StockAction()
    data class FetchSuccess(val stock: List<Stock>) : StockAction()
    data class FetchError(val error: String) : StockAction()
}