package com.example.wear_os_labs.UI_Composable.Components.Buttons

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.ButtonDefaults
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import androidx.wear.compose.material3.IconButton

enum class ButtonAccent {
    HIGH, MEDIUM, LOW
}

@Composable
fun AccentButton(
    onClick: () -> Unit,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    text: String? = null,
    accent: ButtonAccent = ButtonAccent.MEDIUM,
    enabled: Boolean = true,
    modifier: Modifier = Modifier
) {
    val (containerSize, iconSize) = when (accent) {
        ButtonAccent.HIGH -> 60.dp to 30.dp  // Large for high accent
        ButtonAccent.MEDIUM -> 52.dp to 26.dp // Default for medium
        ButtonAccent.LOW -> 48.dp to 24.dp   // Small for low accent
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        when (accent) {
            ButtonAccent.HIGH -> {
                Button(
                    onClick = onClick,
                    modifier = Modifier.size(containerSize),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = MaterialTheme.colors.primary,
                        contentColor = MaterialTheme.colors.onPrimary
                    ),
                    enabled = enabled
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = text,
                        modifier = Modifier.size(iconSize)
                    )
                }
            }
            ButtonAccent.MEDIUM -> {
                Button(
                    onClick = onClick,
                    modifier = Modifier.size(containerSize),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = MaterialTheme.colors.surface,
                        contentColor = MaterialTheme.colors.onSurface
                    ),
                    border = ButtonDefaults.outlinedButtonBorder(
                        borderColor = MaterialTheme.colors.primaryVariant
                    ),
                    enabled = enabled
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = text,
                        modifier = Modifier.size(iconSize)
                    )
                }
            }
            ButtonAccent.LOW -> {
                IconButton(
                    onClick = onClick,
                    modifier = Modifier.size(containerSize),
                    enabled = enabled
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = text,
                        modifier = Modifier.size(iconSize),
                        tint = MaterialTheme.colors.onSurface
                    )
                }
            }
        }

        // Show text label if provided
        text?.let {
            Text(
                text = it,
                style = MaterialTheme.typography.caption2,
                color = MaterialTheme.colors.background,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }
}