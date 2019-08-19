package com.sylfo.distrib

import android.app.Application
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleInstrumentedTest {

    @get:Rule var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext: Application = ApplicationProvider.getApplicationContext()
        assertEquals("com.sylfo.distrib", appContext.packageName)
    }

    @Test
    fun shouldIncrementHello() {
        onView(withId(R.id.tv_text)).check(matches(withText("Hello World! 0")))
        onView(withId(R.id.bt_action)).perform(click())
        onView(withId(R.id.tv_text)).check(matches(withText("Hello World! 1")))
    }
}
