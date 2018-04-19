package io.access.kotlintraining

import kotlin.math.pow

fun welcome() {
    println("welcome to ACCESS!")
}

// TODO: declare hello function
fun hello() {
    println("Hello World!")
}

fun fizzbuzz() {
    for (i in 1..100) {
        if ((i % 3 == 0) && (i % 5 == 0))
            println("FizzBuzz")
        else if (i % 3 == 0)
            println("Fizz")
        else if (i % 5 == 0)
            println("Buzz")
        else
            println(i)
    }
}

fun fizzbuzz_when() {
    for (i in 1..100) {
        when {
            (i % 3 == 0) && (i % 5 == 0) -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }
}

fun fizzbuzz(i: Int): String {
    val str = when {
        (i % 3 == 0) && (i % 5 == 0) -> "FizzBuzz"
        i % 3 == 0 -> "Fizz"
        i % 5 == 0 -> "Buzz"
        else -> i.toString()
    }
    return str
}

fun isLeapYear(y: Int): Boolean {
    return (y % 4 == 0) && !(y % 100 == 0 && y % 400 != 0)
}

fun power(a: Int, n: Int): Long {
    if (a < 0 || n < 0) {
        println("inputs must be positive. return 0")
        return 0
    }

    var ans = 1L
    for (i in 0..(n-1)) {
        ans *= a
    }

    return ans
}

fun power(a: Double, b: Double): Double {
    return a.pow(b)
}