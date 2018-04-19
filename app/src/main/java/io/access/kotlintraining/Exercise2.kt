package io.access.kotlintraining

fun Int.isOdd()  = this % 2 != 0
fun Int.isEven() = this % 2 == 0

class MyCustomClass {
    var counter: Int = 0
    var propertyWithCounter: Int = 0
        set(i) {
            counter++
            field = i
        }
}

class NabeAtsu {
    var cnt = 1

    fun next(): String {
        val str = when {
            cnt % 3 == 0 || contains3(cnt) -> "Aho"
            else -> cnt.toString()
        }

        cnt++
        return str
    }

    fun contains3(n: Int): Boolean {
        var m = n
        do {
            if (m % 10 == 3) return true
            m /= 10
        } while (m != 0)

        return false
    }
}