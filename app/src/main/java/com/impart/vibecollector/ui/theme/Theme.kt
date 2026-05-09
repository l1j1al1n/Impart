package com.impart.vibecollector.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightScheme = lightColorScheme(
    primary = Forest,
    onPrimary = Color.White,
    secondary = Sky,
    tertiary = Clay,
    background = Mist,
    onBackground = Ink,
    surface = Color.White,
    onSurface = Ink,
    surfaceVariant = Color(0xFFE7ECE7),
    onSurfaceVariant = Color(0xFF59645F)
)

@Composable
fun ImpartTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightScheme,
        typography = Typography,
        content = content
    )
}
