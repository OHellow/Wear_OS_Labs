package com.example.wear_os_labs.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import com.example.wear_os_labs.UI_Composable.Screens.ChipScreen

//@Composable
//fun AppNavigation() {
//    var currentScreen by rememberSaveable { mutableStateOf(AppScreen.Main) }
//
//    when (currentScreen) {
//        AppScreen.Main -> MainScreen(
//            onNavigateToList = {
//                println("Navigating to List screen") // Debug log
//                currentScreen = AppScreen.List
//            },
//            onNavigateToCards = {
//                println("Navigating to Cards screen") // Debug log
//                currentScreen = AppScreen.Cards
//            }
//        )
//        AppScreen.List -> ListScreen(
//            onNavigateToMain = {
//                println("Navigating back to Main screen") // Debug log
//                currentScreen = AppScreen.Main
//            }
//        )
//        AppScreen.Cards -> CardShowcaseScreen(
//            onNavigateBack = {
//                println("Navigating back to Main screen") // Debug log
//                currentScreen = AppScreen.Main
//            }
//        )
//    }
//}
//
//enum class AppScreen {
//    Main, List, Cards
//}