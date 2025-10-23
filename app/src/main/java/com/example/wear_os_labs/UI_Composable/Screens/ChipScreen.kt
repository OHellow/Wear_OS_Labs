package com.example.wear_os_labs.UI_Composable.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.MaterialTheme
import com.example.wear_os_labs.UI_Composable.Components.Chips.BasicChipSection
import com.example.wear_os_labs.UI_Composable.Components.Chips.AccentHierarchySection
import com.example.wear_os_labs.UI_Composable.Components.Chips.AvatarChipSection
import com.example.wear_os_labs.UI_Composable.Components.Chips.CompactChipSection
import com.example.wear_os_labs.UI_Composable.Components.Chips.ImageBackgroundChipSection

@Composable
fun ChipScreen() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp)
    ) {
        Text(
            text = "Chip Components",
            color = Color.Black,
            style = MaterialTheme.typography.title2,
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp))

        BasicChipSection()

        Spacer(modifier = Modifier.height(12.dp))

        ImageBackgroundChipSection()

        Spacer(modifier = Modifier.height(12.dp))

        AvatarChipSection()

        Spacer(modifier = Modifier.height(12.dp))

        CompactChipSection()

        Spacer(modifier = Modifier.height(12.dp))

        AccentHierarchySection()

        Spacer(modifier = Modifier.height(24.dp))
    }
}