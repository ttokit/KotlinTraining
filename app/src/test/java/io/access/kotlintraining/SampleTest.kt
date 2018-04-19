package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals

class SampleTest {
    @Test
    fun testWelcome() {
        welcome()

        // Example of test
        val expected = 1
        val actual = 1
        assertEquals(expected, actual, "[want] $expected [got] $actual")
    }

    @Test
    fun testHello() {
        // TODO: implement to call hello function
        hello()
    }

    @Test
    fun testFizzbuzz() {
        //fizzbuzz()

        assertEquals(fizzbuzz(1), "1")
        assertEquals(fizzbuzz(3), "Fizz")
        assertEquals(fizzbuzz(5), "Buzz")
        assertEquals(fizzbuzz(15), "FizzBuzz")
        assertEquals(fizzbuzz(22), "22")
    }

    @Test
    fun testFizzbuzz_when() {
        fizzbuzz_when()
    }

    @Test
    fun testIsLeapYear() {
        assertEquals(isLeapYear(1700), false)
        assertEquals(isLeapYear(1800), false)
        assertEquals(isLeapYear(1900), false)
        assertEquals(isLeapYear(2100), false)
        assertEquals(isLeapYear(2200), false)
        assertEquals(isLeapYear(2300), false)
        assertEquals(isLeapYear(2500), false)
        assertEquals(isLeapYear(2600), false)

        assertEquals(isLeapYear(1600), true)
        assertEquals(isLeapYear(2000), true)
        assertEquals(isLeapYear(2400), true)
    }
}