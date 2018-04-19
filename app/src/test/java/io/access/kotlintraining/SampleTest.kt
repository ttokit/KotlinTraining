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

    @Test
    fun testPower() {
        assertEquals(power(2,0), 1)
        assertEquals(power(2,1), 2)
        assertEquals(power(2,5), 32)
        assertEquals(power(11,5), 161051)
        assertEquals(power(10, 5), 100000)
        assertEquals(power(2,10), 1024)

        assertEquals(power(-3, 2), 0)

        assertEquals(power(2.0,0.0), 1.0)
        assertEquals(power(3.0,1.0), 3.0)
        assertEquals(power(2.5, 3.1), 17.12434728726902)
    }
}