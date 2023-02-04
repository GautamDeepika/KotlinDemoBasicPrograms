package com.example.kotlindemo.kotlintutorialdemo

fun main() {
    val person = Employee("Himani", 30)

}

class Employee(val name: String) {

    init {
        //initialiser block
        println("initialiser called")

    }

    init {
        println("initialiser 2 called")

    }

    init {
        println("initialiser 3 called")

    }

    constructor(fullName: String, age: Int) : this(fullName) {
        println("Secondary constructor called")
    }
}