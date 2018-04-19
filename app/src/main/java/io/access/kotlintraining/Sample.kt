package io.access.kotlintraining

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