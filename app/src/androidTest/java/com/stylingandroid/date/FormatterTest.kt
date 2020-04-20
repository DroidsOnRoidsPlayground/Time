package com.stylingandroid.date

import org.junit.Before
import org.junit.Test
import java.time.YearMonth
import java.time.format.DateTimeFormatter
import java.util.*

class FormatterTest {

    @Before
    fun setUp() {
        Locale.setDefault(Locale.US)
    }

    @Test
    fun x() {
        val value = DateTimeFormatter.ofPattern("LLLL yyyy").format(YearMonth.of(2020, 4))
        println(value)
        assert(value == "April 2020")
    }
}
