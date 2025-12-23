package com.example.sectortracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.sectortracker.data.repository.StockRepository
import com.example.sectortracker.navigation.NavGraph
import com.example.sectortracker.screens.SplashScreen
import com.example.sectortracker.ui.theme.SectorTrackerTheme

class MainActivity : ComponentActivity() {
    private val repository by lazy { StockRepository(this) }
    private val viewModel: StockViewModel by viewModels {
        StockViewModelFactory(repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SectorTrackerApp(viewModel = viewModel)
        }
    }
}

@Composable
fun SectorTrackerApp(viewModel: StockViewModel) {
    var showSplash by remember { mutableStateOf(true) }

    SectorTrackerTheme {
        if (showSplash) {
            SplashScreen(
                onSplashFinished = { showSplash = false }
            )
        } else {
            NavGraph(viewModel = viewModel)
        }
    }
}