package com.goaldiary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.goaldiary.core.ui.theme.GoalDiaryTheme
import com.goaldiary.navigation.GoalDiaryApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GoalDiaryTheme {
                GoalDiaryApp()
            }
        }
    }
}
