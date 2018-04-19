package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.asserter

class Exercise2Test {
    @Test
    fun testIsOdd_and_Even() {
        assertEquals(5.isOdd(), true)
        assertEquals(5.isEven(), false)
    }

    @Test
    fun testMyCustomClass() {
        val p = MyCustomClass()
        p.propertyWithCounter = 123
        p.propertyWithCounter = 456
        p.propertyWithCounter = 789
        assertEquals(p.counter, 3)
    }

    @Test
    fun testNabeAtsu() {
        val n = NabeAtsu()
        for (i in 1..100) {
            println(n.next())
        }
    }
}