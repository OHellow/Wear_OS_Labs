package com.example.wear_os_labs.UI_Composable.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Scaffold
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.TimeText
import com.example.wear_os_labs.UI_Composable.Components.Greeting
import com.example.wear_os_labs.UI_Composable.Components.Buttons.PrimaryButton
import com.example.wear_os_labs.UI_Composable.Components.SimpleList

@Composable
fun MainScreen(
    onNavigateToList: () -> Unit
) {
    var showList by remember { mutableStateOf(false) }
    var clickCount by remember { mutableStateOf(0) }

    Scaffold(
        timeText = { TimeText() }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Greeting(
                name = "Android",
                clickCount = clickCount,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                PrimaryButton(
                    text = "Increment Counter",
                    onClick = { clickCount++ },
                    modifier = Modifier.fillMaxWidth(0.8f)
                )

                PrimaryButton(
                    text = "Go to List Screen",
                    onClick = onNavigateToList,
                    modifier = Modifier.fillMaxWidth(0.8f)
                )

                PrimaryButton(
                    text = if (showList) "Hide List" else "Show List",
                    onClick = { showList = !showList },
                    modifier = Modifier.fillMaxWidth(0.8f)
                )
            }

            if (showList) {
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Available Courses",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    color = androidx.wear.compose.material.MaterialTheme.colors.primary,
                    style = androidx.wear.compose.material.MaterialTheme.typography.title3
                )

                Spacer(modifier = Modifier.height(8.dp))

                SimpleList(
                    items = listOf(
                        "Mobile Development",
                        "Wear OS Basics",
                        "Compose Tutorial",
                        "Kotlin Fundamentals",
                        "Android Architecture"
                    ),
                    onItemClick = { item ->
                        println("Selected course: $item")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(180.dp)
                )
            }
        }
    }
}