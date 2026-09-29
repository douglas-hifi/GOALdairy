package com.goaldiary.navigation

import org.junit.Assert.assertEquals
import org.junit.Test

class AppDestinationTest {
    @Test
    fun bottomNavigationDestinationsHaveUniqueRoutesAndExpectedOrder() {
        assertEquals(
            listOf("home", "schedule", "goals", "records", "settings"),
            AppDestination.entries.map(AppDestination::route),
        )
        assertEquals(AppDestination.entries.size, AppDestination.entries.map(AppDestination::route).toSet().size)
    }
}
