package com.example.wear_os_labs.UI_Composable.Components.Chips

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Alignment
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Man
import androidx.compose.ui.text.style.TextAlign
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.ChipDefaults
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.MaterialTheme

@Composable
fun AvatarChipSection() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Avatar chips",
            style = MaterialTheme.typography.title3,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(8.dp))

        Chip(
            label = {
                Text("Jessica Jones")
            },
            secondaryLabel = {
                Text("Online")
            },
            icon = {
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFFF6D00)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "JJ",
                        style = MaterialTheme.typography.caption2,
                        color = Color.White
                    )
                }
            },
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ChipDefaults.primaryChipColors()
        )

        Spacer(modifier = Modifier.height(8.dp))

        Chip(
            label = {
                Text("User profile")
            },
            icon = {
                Icon(
                    imageVector = Icons.Default.Man,
                    contentDescription = "Profile",
                    modifier = Modifier.size(32.dp)
                )
            },
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ChipDefaults.primaryChipColors()
        )

        Spacer(modifier = Modifier.height(8.dp))

        Chip(
            label = {
                Text("John Dow")
            },
            icon = {
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .clip(CircleShape)
                        .background(Color(0xFF2196F3)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "JD",
                        style = MaterialTheme.typography.caption2,
                        color = Color.White
                    )
                }
            },
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ChipDefaults.outlinedChipColors()
        )
    }
}