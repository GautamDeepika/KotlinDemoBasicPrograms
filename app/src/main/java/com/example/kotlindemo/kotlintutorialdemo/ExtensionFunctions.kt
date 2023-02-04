package com.example.kotlindemo.kotlintutorialdemo

fun main() {
    val numOne = 5
    val numTwo = 15

    val numThree = 50
    val numFour = 55

    println("Addition is ${numOne + numTwo}")
    println("subtraction is ${numOne - numTwo}")
    println("multiplication is ${numOne * numTwo}")

    println("Addition is ${numThree + numFour}")
    println("subtraction is ${numThree - numFour}")
    println("multiplication is ${numThree * numFour}")

    val num = 5
    num.airthmetic(20)

    "Deepali".midValue()
}

fun Int.airthmetic(num: Int) {
    println("Addition is ${this + num}")
    println("subtraction is ${this - num}")
    println("multiplication is ${this * num}")
}

fun String.midValue() {
    if (this.length % 2 == 0) {
        println("it has no mid value")
    } else {
        println(this[this.length % 2])
    }
}