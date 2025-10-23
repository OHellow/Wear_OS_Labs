package com.example.wear_os_labs.UI_Composable.Utilities

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.MaterialTheme

enum class ScreenSize {
    SMALL, MEDIUM, LARGE
}

data class CardSpecs(
    val padding: Dp,
    val verticalSpacing: Dp,
    val contentSpacing: Dp,
    val cornerRadius: Dp,
    val elevation: Dp,
    val iconSize: Dp,
    val titleStyle: TextStyle,
    val timeStyle: TextStyle,
    val primaryContentStyle: TextStyle,
    val secondaryContentStyle: TextStyle,
    val titleFontWeight: FontWeight
)

@Composable
fun getCardSpecsForScreenSize(screenSize: ScreenSize): CardSpecs {
    return when (screenSize) {
        ScreenSize.SMALL -> CardSpecs(
            padding = 12.dp,
            verticalSpacing = 8.dp,
            contentSpacing = 6.dp,
            cornerRadius = 12.dp,
            elevation = 2.dp,
            iconSize = 18.dp,
            titleStyle = MaterialTheme.typography.title3,
            timeStyle = MaterialTheme.typography.caption2,
            primaryContentStyle = MaterialTheme.typography.body2,
            secondaryContentStyle = MaterialTheme.typography.caption1,
            titleFontWeight = FontWeight.Medium
        )
        ScreenSize.MEDIUM -> CardSpecs(
            padding = 16.dp,
            verticalSpacing = 12.dp,
            contentSpacing = 8.dp,
            cornerRadius = 16.dp,
            elevation = 4.dp,
            iconSize = 20.dp,
            titleStyle = MaterialTheme.typography.title2,
            timeStyle = MaterialTheme.typography.caption1,
            primaryContentStyle = MaterialTheme.typography.body1,
            secondaryContentStyle = MaterialTheme.typography.body2,
            titleFontWeight = FontWeight.SemiBold
        )
        ScreenSize.LARGE -> CardSpecs(
            padding = 20.dp,
            verticalSpacing = 16.dp,
            contentSpacing = 12.dp,
            cornerRadius = 20.dp,
            elevation = 6.dp,
            iconSize = 24.dp,
            titleStyle = MaterialTheme.typography.title1,
            timeStyle = MaterialTheme.typography.body2,
            primaryContentStyle = MaterialTheme.typography.caption2,
            secondaryContentStyle = MaterialTheme.typography.body1,
            titleFontWeight = FontWeight.Bold
        )
    }
}