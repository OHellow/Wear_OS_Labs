package com.example.wear_os_labs.UI_Composable.Components.Buttons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.ButtonDefaults
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import androidx.wear.compose.material3.IconButton

@Composable
fun ButtonSizeVariants() {
    var toggleState by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Large size
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Button(
                onClick = { toggleState = !toggleState },
                modifier = Modifier.size(60.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.primary
                )
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Large",
                    modifier = Modifier.size(30.dp)
                )
            }
            Text(
                text = "Large",
                style = MaterialTheme.typography.caption3,
                color = if (toggleState) MaterialTheme.colors.onBackground
                        else MaterialTheme.colors.background
            )
        }

        // Default size
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Button(
                onClick = { toggleState = !toggleState },
                modifier = Modifier.size(52.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.surface
                )
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Default",
                    modifier = Modifier.size(26.dp)
                )
            }
            Text(
                text = "Default",
                style = MaterialTheme.typography.caption3,
                color = if (toggleState) MaterialTheme.colors.onBackground
                        else MaterialTheme.colors.background
            )
        }

        // Small size
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Button(
                onClick = { toggleState = !toggleState },
                modifier = Modifier.size(48.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.surface
                )
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Small",
                    modifier = Modifier.size(24.dp)
                )
            }
            Text(
                text = "Small",
                style = MaterialTheme.typography.caption3,
                color = if (toggleState) MaterialTheme.colors.onBackground
                        else MaterialTheme.colors.background
            )
        }

        // Extra Small size
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            IconButton(
                onClick = { toggleState = !toggleState },
                modifier = Modifier.size(32.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "XSmall",
                    modifier = Modifier.size(24.dp),
                    tint = MaterialTheme.colors.onSurface
                )
            }
            Text(
                text = "XSmall",
                style = MaterialTheme.typography.caption3,
                color = if (toggleState) MaterialTheme.colors.onBackground
                        else MaterialTheme.colors.background
            )
        }
    }
}