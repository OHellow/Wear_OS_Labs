
package com.example.wear_os_labs.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.wear_os_labs.UI_Composable.Screens.MainScreen
import com.example.wear_os_labs.presentation.theme.Wear_OS_LabsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Wear_OS_LabsTheme {
                MainScreen()
            }
        }
    }
}