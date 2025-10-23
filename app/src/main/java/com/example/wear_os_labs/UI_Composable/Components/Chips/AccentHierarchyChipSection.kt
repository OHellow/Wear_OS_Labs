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
import androidx.wear.compose.material.ToggleChip
import androidx.wear.compose.material.ToggleChipDefaults
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Upload
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign

@Composable
fun AccentHierarchySection() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Accent hierarchy",
            style = MaterialTheme.typography.title3,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(8.dp))

        Chip(
            label = {
                Text("High accent", maxLines = 1)
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.Upload,
                    contentDescription = "Upload",
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
                Text("Medium accent", maxLines = 1)
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription = "Share",
                    modifier = Modifier.size(24.dp)
                )
            },
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ChipDefaults.outlinedChipColors()
        )

        Spacer(modifier = Modifier.height(8.dp))

        Chip(
            label = {
                Text("Low accent", maxLines = 1)
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.Info,
                    contentDescription = "Info",
                    modifier = Modifier.size(24.dp)
                )
            },
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ChipDefaults.gradientBackgroundChipColors()
        )

        Spacer(modifier = Modifier.height(8.dp))

        ToggleChip(
            checked = true,
            label = {
                Text("Turned on")
            },
            toggleControl = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "Locked"
                )
            },
            onCheckedChange = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ToggleChipDefaults.toggleChipColors(
                checkedStartBackgroundColor = MaterialTheme.colors.primary,
                checkedEndBackgroundColor = MaterialTheme.colors.primary,
                uncheckedStartBackgroundColor = MaterialTheme.colors.surface,
                uncheckedEndBackgroundColor = MaterialTheme.colors.surface
            )
        )
    }
}