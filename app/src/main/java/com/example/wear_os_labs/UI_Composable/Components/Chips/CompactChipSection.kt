package com.example.wear_os_labs.UI_Composable.Components.Chips

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.Row
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
import androidx.compose.material.icons.filled.Save
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign

@Composable
fun CompactChipSection() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Compact Chips",
            style = MaterialTheme.typography.title3,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Chip(
                label = {
                    Text("Play", maxLines = 1)
                },
                icon = {
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = "Play",
                        modifier = Modifier.size(20.dp)
                    )
                },
                onClick = {},
                modifier = Modifier
                    .weight(1f)
                    .height(32.dp),
                colors = ChipDefaults.primaryChipColors()
            )

            Spacer(modifier = Modifier.padding(4.dp))

            Chip(
                label = {
                    Text("Stop", maxLines = 1)
                },
                onClick = {},
                modifier = Modifier
                    .weight(1f)
                    .height(32.dp),
                colors = ChipDefaults.primaryChipColors()
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Chip(
                label = {
                    Text("Save", maxLines = 1)
                },
                icon = {
                    Icon(
                        imageVector = Icons.Default.Save,
                        contentDescription = "Save",
                        modifier = Modifier.size(20.dp)
                    )
                },
                onClick = {},
                modifier = Modifier
                    .weight(1f)
                    .height(32.dp),
                colors = ChipDefaults.outlinedChipColors()
            )

            Spacer(modifier = Modifier.padding(4.dp))

            Chip(
                label = {
                    Text("Cancel", maxLines = 1)
                },
                onClick = {},
                modifier = Modifier
                    .weight(1f)
                    .height(32.dp),
                colors = ChipDefaults.gradientBackgroundChipColors()
            )
        }
    }
}