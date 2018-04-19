package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals

class Exercise2Test {
    @Test
    fun isOdd_and_Even() {
        assertEquals(5.isOdd(), true)
        assertEquals(5.isEven(), false)
    }
}