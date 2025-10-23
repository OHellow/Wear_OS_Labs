package com.example.wear_os_labs.UI_Composable.Components.Chips

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.ChipDefaults
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.MaterialTheme
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Send
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign

@Composable
fun BasicChipSection() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Basic Chips",
            style = MaterialTheme.typography.title3,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(8.dp))

        Chip(
            label = {
                Text("Primary text", maxLines = 1)
            },
            secondaryLabel = {
                Text("Secondary text")
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = "Play",
                    modifier = Modifier.size(24.dp)
                )
            },
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ChipDefaults.primaryChipColors()
        )

        Spacer(modifier = Modifier.height(8.dp))

        Chip(
            label = {
                Text("Text only", maxLines = 1)
            },
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ChipDefaults.primaryChipColors()
        )

        Spacer(modifier = Modifier.height(8.dp))

        Chip(
            label = {
                Text("Icon and text", maxLines = 1)
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.Send,
                    contentDescription = "Send",
                    modifier = Modifier.size(24.dp)
                )
            },
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ChipDefaults.primaryChipColors()
        )
    }
}