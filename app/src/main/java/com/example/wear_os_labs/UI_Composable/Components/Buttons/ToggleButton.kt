package com.example.wear_os_labs.UI_Composable.Components.Buttons

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.ToggleButton
import androidx.wear.compose.material.ToggleButtonDefaults

@Composable
fun ToggleButton(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    text: String,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        ToggleButton(
            checked = checked,
            onCheckedChange = onCheckedChange,
            modifier = Modifier.size(52.dp),
            colors = ToggleButtonDefaults.toggleButtonColors(
                checkedBackgroundColor = MaterialTheme.colors.primary,
                checkedContentColor = MaterialTheme.colors.onPrimary,
                uncheckedBackgroundColor = MaterialTheme.colors.surface,
                uncheckedContentColor = MaterialTheme.colors.onSurface
            )
        ) {
            Icon(
                imageVector = icon,
                contentDescription = text,
                modifier = Modifier.size(26.dp)
            )
        }
        Text(
            text = text,
            style = MaterialTheme.typography.caption2,
            color = MaterialTheme.colors.background,
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}