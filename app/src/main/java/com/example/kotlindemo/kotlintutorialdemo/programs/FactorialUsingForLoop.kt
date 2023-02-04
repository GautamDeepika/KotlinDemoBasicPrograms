package com.example.kotlindemo.kotlintutorialdemo.programs

class FactorialUsingForLoop {
    fun factorial(num: Int): Int {
        var fact = 1;
        for (i in 1..num) {
            fact *= i
        }
        return fact
    }
}

fun main() {
    val factorialUsingForLoop = FactorialUsingForLoop()
    print(factorialUsingForLoop.factorial(5))
}