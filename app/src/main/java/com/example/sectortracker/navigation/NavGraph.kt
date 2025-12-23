package com.example.sectortracker.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sectortracker.StockViewModel
import com.example.sectortracker.screens.DetailsScreen
import com.example.sectortracker.screens.HomeScreen

@Composable
fun NavGraph(viewModel: StockViewModel) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(navController = navController, viewModel = viewModel)
        }
        composable("details") {
            DetailsScreen(navController = navController, viewModel = viewModel)
        }
    }
}