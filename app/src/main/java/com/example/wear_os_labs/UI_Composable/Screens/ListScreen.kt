package com.example.wear_os_labs.UI_Composable.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Scaffold
import androidx.wear.compose.material.TimeText
import com.example.wear_os_labs.UI_Composable.Components.Buttons.PrimaryButton
import com.example.wear_os_labs.UI_Composable.Components.SimpleList

@Composable
fun ListScreen(
    onNavigateToMain: () -> Unit
) {
    Scaffold(
        timeText = { TimeText() }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            PrimaryButton(
                text = "Back to Main",
                onClick = onNavigateToMain,
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .padding(bottom = 16.dp)
            )

            SimpleList(
                items = (1..10).map { "List Item $it" },
                onItemClick = { item ->
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            )
        }
    }
}