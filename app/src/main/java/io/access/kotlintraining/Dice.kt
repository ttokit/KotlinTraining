package io.access.kotlintraining

import java.lang.Exception
import java.util.Random

class Dice(val n: Int) {
    var count = 0

    fun roll(): Int {
        val random = Random()
        if (count++ >= 100) throw Exception("I was broken")

        return random.nextInt(n + 1)
    }
}