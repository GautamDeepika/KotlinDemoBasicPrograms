package com.example.kotlindemo.kotlintutorialdemo

fun main() {
    //Higher order functions
    //takes function as parameter and returns a function
    val add = doAddition()
    println(add(20, 20))

    printMyName {
        println(it)
    }

    rollDice(1..6, 3) {
        println("rollDice result is : $it")
    }
}

//normal fun
/*
fun add(n:Int, m:Int) = n*m
 */
//............................ function as a return type......................................

fun doAddition(): (Int, Int) -> Int {
    return ::addNumbers
}

fun addNumbers(num1: Int, num2: Int) = num1.plus(num2)

//............................ function as a parameter......................................
fun printMyName(print: (String) -> Unit) {
    print("Hi")
}

//............higher order function...........................................................
fun rollDice(range: IntRange, time: Int,
    callback: (result: Int) -> Unit
) {
    for (i in 0 until time) {
        val result = range.random()
        callback(result)
    }
}