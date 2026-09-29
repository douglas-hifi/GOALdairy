package com.goaldiary.core.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val GoalDiaryColorScheme = lightColorScheme(
    primary = Color(0xFF405C4B),
    onPrimary = Color.White,
    secondary = Color(0xFF76624A),
    background = Color(0xFFF7F7F2),
    surface = Color(0xFFF7F7F2),
    surfaceContainer = Color(0xFFEFEEE6),
)

@Composable
fun GoalDiaryTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = GoalDiaryColorScheme,
        typography = GoalDiaryTypography,
        content = content,
    )
}
