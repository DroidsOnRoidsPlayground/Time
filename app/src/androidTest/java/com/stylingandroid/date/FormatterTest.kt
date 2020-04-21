package com.stylingandroid.date


import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.time.YearMonth
import java.time.format.DateTimeFormatter
import java.util.*

class FormatterTest {

    @BeforeEach
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
