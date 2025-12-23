package com.example.sectortracker.mvi

import com.example.sectortracker.StockListState


fun stockReducer(oldState: StockState, action: StockAction): StockState {
    return when (action) {
        is StockAction.FetchError -> {
            oldState.copy(
                stockListState = StockListState.Error(action.error),
                error = Exception(action.error),
                stocks = null
            )
        }
        is StockAction.FetchSuccess -> {
            oldState.copy(
                stockListState = if (action.stock.isEmpty()) StockListState.Empty
                else StockListState.Success(action.stock),
                stocks = action.stock,
                error = null
            )
        }
        is StockAction.FetchListOfStock -> {
            oldState.copy(
                stockListState = StockListState.Loading,
                error = null

            )
        }
        is StockAction.SelectedStock -> {
            oldState.copy(
                selectedStock = action.stock
            )
        }
    }
}