package com.goaldiary.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notes
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.TrackChanges
import androidx.compose.ui.graphics.vector.ImageVector

enum class AppDestination(
    val route: String,
    val label: String,
    val icon: ImageVector,
) {
    Home("home", "Home", Icons.Default.Home),
    Schedule("schedule", "Schedule", Icons.Default.CalendarMonth),
    Goals("goals", "Goals", Icons.Default.TrackChanges),
    Records("records", "Records", Icons.Default.Notes),
    Settings("settings", "Settings", Icons.Default.Settings),
}
