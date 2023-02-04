package com.example.kotlindemo.kotlintutorialdemo

fun main() {
    // inheriting from its parent class
    val addition = Addition(5, 10, 5)
    println(addition.add())
}

// open means it became inheritable because in kotlin, by default every class is final
open class BaseAddition(val num1: Int, val num2: Int) {
    open fun add() = num1 + num2
}

class Addition(val numOne: Int, val numTwo: Int, val numThree: Int) : BaseAddition(numOne, numTwo) {
    override fun add(): Int {
        return numOne.plus(numTwo).plus(numThree)
    }
}

