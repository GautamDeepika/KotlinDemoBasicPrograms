package com.example.kotlindemo.kotlintutorialdemo.programs

fun main() {
    var fact = 1
    var number = 5
    fact = FactorialUsingRecursion.findFact(number)
    print(fact)
}

class FactorialUsingRecursion {
    companion object {

        fun findFact(num: Int): Int {
            return if (num == 0) {
                1
            } else {
                num* findFact(num - 1)
            }
        }
    }
}