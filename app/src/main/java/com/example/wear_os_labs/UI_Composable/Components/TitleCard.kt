package com.example.wear_os_labs.UI_Composable.Components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Card
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import com.example.wear_os_labs.UI_Composable.Utilities.getCardSpecsForScreenSize
import com.example.wear_os_labs.UI_Composable.Utilities.ScreenSize

@Composable
fun TitleCard() {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp
    val density = LocalDensity.current

    val screenSize = when {
        screenWidth >= 400 -> ScreenSize.LARGE
        screenWidth >= 320 -> ScreenSize.MEDIUM
        else -> ScreenSize.SMALL
    }

    val cardSpecs = getCardSpecsForScreenSize(screenSize)

    Card(
        onClick = {},
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(max = with(density) { (configuration.screenHeightDp * 0.6).dp })
            .clip(RoundedCornerShape(cardSpecs.cornerRadius))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(cardSpecs.padding),
            verticalArrangement = Arrangement.spacedBy(cardSpecs.verticalSpacing)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(cardSpecs.contentSpacing),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Notifications",
                    style = cardSpecs.titleStyle,
                    color = MaterialTheme.colors.onSurface,
                    fontWeight = cardSpecs.titleFontWeight,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = "10:30 AM",
                    style = cardSpecs.timeStyle,
                    color = MaterialTheme.colors.onSurface.copy(alpha = 0.7f)
                )
            }

            Column(
                verticalArrangement = Arrangement.spacedBy(cardSpecs.contentSpacing)
            ) {
                Text(
                    text = "You have 3 new messages",
                    style = cardSpecs.primaryContentStyle,
                    color = MaterialTheme.colors.onSurface,
                )

                if (screenSize >= ScreenSize.MEDIUM) {
                    Text(
                        text = "Check your inbox for important updates",
                        style = cardSpecs.secondaryContentStyle,
                        color = MaterialTheme.colors.onSurface.copy(alpha = 0.8f),
                        maxLines = if (screenSize == ScreenSize.LARGE) 2 else 1
                    )
                }

                if (screenSize == ScreenSize.LARGE) {
                    Text(
                        text = "Including 2 priority notifications from your fitness app",
                        style = cardSpecs.secondaryContentStyle,
                        color = MaterialTheme.colors.onSurface.copy(alpha = 0.6f),
                        fontStyle = FontStyle.Italic
                    )
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = if (screenSize == ScreenSize.LARGE) Arrangement.SpaceBetween else Arrangement.End
            ) {
                if (screenSize == ScreenSize.LARGE) {
                    Text(
                        text = "Last updated: 5 min ago",
                        style = MaterialTheme.typography.caption3,
                        color = MaterialTheme.colors.onSurface.copy(alpha = 0.5f)
                    )
                }
            }
        }
    }
}