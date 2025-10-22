package com.example.wear_os_labs.UI_Composable.Components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Stop
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import com.example.wear_os_labs.UI_Composable.Components.Buttons.AccentButton
import com.example.wear_os_labs.UI_Composable.Components.Buttons.ToggleButton
import com.example.wear_os_labs.UI_Composable.Components.Buttons.CompactButton
import com.example.wear_os_labs.UI_Composable.Components.Buttons.ButtonSizeVariants
import com.example.wear_os_labs.UI_Composable.Components.Buttons.ButtonAccent

@Composable
fun ButtonShowcase() {
    var timerRunning by remember { mutableStateOf(false) }
    var toggleState by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        // Section 1: Button Accents (using generic AccentButton)
        Text(
            text = "Button Accents",
            style = MaterialTheme.typography.caption2,
            color = MaterialTheme.colors.background,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        // High Accent
        AccentButton(
            onClick = { timerRunning = !timerRunning },
            icon = if (timerRunning) Icons.Default.Stop else Icons.Default.PlayArrow,
            text = if (timerRunning) "Stop" else "Start",
            accent = ButtonAccent.HIGH,
            modifier = Modifier.fillMaxWidth(0.8f)
        )

        Row(
            modifier = Modifier.fillMaxWidth(0.9f),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            // Medium Accent
            AccentButton(
                onClick = { /* Handle click */ },
                icon = Icons.Default.Settings,
                text = "Settings",
                accent = ButtonAccent.MEDIUM
            )

            // Low Accent
            AccentButton(
                onClick = { /* Handle click */ },
                icon = Icons.Default.Favorite,
                text = "Favorite",
                accent = ButtonAccent.LOW
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Section 2: Button Types (using specialized buttons)
        Text(
            text = "Button Types",
            style = MaterialTheme.typography.caption2,
            color = MaterialTheme.colors.background,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Row(
            modifier = Modifier.fillMaxWidth(0.9f),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            // Toggle Button (specialized)
            ToggleButton(
                checked = toggleState,
                onCheckedChange = { toggleState = it },
                icon = if (toggleState) Icons.Default.PlayArrow else Icons.Default.Pause,
                text = "Toggle"
            )

            // Compact Button (specialized)
            CompactButton(
                onClick = { /* Handle click */ },
                icon = Icons.Default.Check,
                text = "Pause"
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Section 3: Button Sizes (using specialized component)
        Text(
            text = "Button Sizes",
            style = MaterialTheme.typography.caption2,
            color = MaterialTheme.colors.background,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        ButtonSizeVariants()

        Spacer(modifier = Modifier.height(16.dp))
    }
}