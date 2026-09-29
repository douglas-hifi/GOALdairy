package com.goaldiary

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test

class GoalDiaryNavigationTest {
    @get:Rule
    val composeRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun bottomNavigationOpensGoalsPlaceholder() {
        composeRule.onNodeWithText("Today").assertIsDisplayed()
        composeRule.onNodeWithText("Goals").performClick()
        composeRule.onNodeWithText("Placeholder screen · planned for a later development phase.").assertIsDisplayed()
    }
}
