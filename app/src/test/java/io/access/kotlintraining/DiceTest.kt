package io.access.kotlintraining

import org.junit.Test

class DiceTest {
    @Test
    fun rollTest() {
        val d = Dice(16)
        for (i in 1..100) {
            println("$i" + ": " + d.roll()) // 1〜16 までの数字
        }
        println(d.roll()) // Exception
    }
}