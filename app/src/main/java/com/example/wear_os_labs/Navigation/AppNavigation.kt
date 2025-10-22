package com.example.wear_os_labs.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.wear_os_labs.UI_Composable.Screens.MainScreen
import com.example.wear_os_labs.UI_Composable.Screens.ListScreen

@Composable
fun AppNavigation() {
    var currentScreen by remember { mutableStateOf(AppScreen.Main) }

    when (currentScreen) {
        AppScreen.Main -> MainScreen(
            onNavigateToList = { currentScreen = AppScreen.List }
        )
        AppScreen.List -> ListScreen(
            onNavigateToMain = { currentScreen = AppScreen.Main }
        )
    }
}

enum class AppScreen {
    Main, List
}