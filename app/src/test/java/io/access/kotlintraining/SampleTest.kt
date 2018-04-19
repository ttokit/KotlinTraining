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
}