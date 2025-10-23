package com.example.wear_os_labs.UI_Composable.Components.Chips

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Alignment
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.ChipDefaults
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.MaterialTheme
import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Photo
import androidx.compose.material.icons.filled.PhotoCamera
import androidx.compose.ui.text.style.TextAlign
import androidx.wear.compose.material.Colors

@Composable
fun ImageBackgroundChipSection() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Chips with background",
            style = MaterialTheme.typography.title3,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(8.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFF6200EE),
                            Color(0xFF3700B3)
                        )
                    )
                )
        ) {
            Chip(
                label = {
                    Text("Gradient background", maxLines = 1)
                },
                secondaryLabel = {
                    Text("Nice gradient")
                },
                icon = {
                    Icon(
                        imageVector = Icons.Default.Photo,
                        contentDescription = "Gallery",
                        modifier = Modifier.size(24.dp)
                    )
                },
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                colors = ChipDefaults.primaryChipColors(
                    backgroundColor = Color.Transparent
                )
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color(0xFFFF6D00),
                            Color(0xFFFFAB00)
                        )
                    )
                )
        ) {
            Chip(
                label = {
                    Text("Horizontal gradient", maxLines = 1)
                },
                icon = {
                    Icon(
                        imageVector = Icons.Default.PhotoCamera,
                        contentDescription = "Camera",
                        modifier = Modifier.size(24.dp)
                    )
                },
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                colors = ChipDefaults.primaryChipColors(
                    backgroundColor = Color.Transparent
                )
            )
        }
    }
}