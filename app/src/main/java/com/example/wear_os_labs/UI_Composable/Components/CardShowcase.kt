package com.example.wear_os_labs.UI_Composable.Components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import com.example.wear_os_labs.UI_Composable.Components.Buttons.AccentButton
import com.example.wear_os_labs.UI_Composable.Components.Buttons.ButtonAccent

@Composable
fun CardShowcase(
    onNavigateBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()), // Only one scroll modifier here
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Text(
            text = "Title Card",
            style = MaterialTheme.typography.caption2,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        TitleCard()

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "App Card",
            style = MaterialTheme.typography.caption2,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        AppCard()

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Image Card",
            style = MaterialTheme.typography.caption2,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        ImageCard()

        Spacer(modifier = Modifier.height(16.dp))
        AccentButton(
            onClick = onNavigateBack,
            icon = Icons.Default.ArrowBack,
            text = "Back",
            accent = ButtonAccent.MEDIUM,
            modifier = Modifier.fillMaxWidth(0.8f)
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}