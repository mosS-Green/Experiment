package com.example.themusicwidget.widget

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.action.clickable
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.Alignment
import androidx.glance.layout.Column
import androidx.glance.layout.Row
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.padding
import androidx.glance.text.Text
import androidx.glance.text.TextStyle
import androidx.glance.unit.ColorProvider

class MusicWidget : GlanceAppWidget() {

    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            MusicWidgetContent()
        }
    }

    @Composable
    private fun MusicWidgetContent() {
        Column(
            modifier = GlanceModifier
                .fillMaxSize()
                .background(Color.DarkGray)
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Now Playing",
                style = TextStyle(color = ColorProvider(Color.White))
            )
            Row(
                modifier = GlanceModifier.padding(top = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Play",
                    style = TextStyle(color = ColorProvider(Color.White)),
                    modifier = GlanceModifier.clickable {
                        // Action
                    }
                )
            }
        }
    }
}
