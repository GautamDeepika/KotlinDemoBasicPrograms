package com.example.kotlindemo.kotlintutorialdemo

fun main() {
//    val computer = Computer("Windows", 2)
//computer
    val sum = Computer.add(5, 5)
    println(sum)
}

class Computer(val os: String) {
    companion object {
        fun add(num1: Int, num2: Int) = num1.plus(num2)
    }

    constructor(os: String, quantity: Int) : this(os) {
        println("Secondary constructor called")

    }
}

