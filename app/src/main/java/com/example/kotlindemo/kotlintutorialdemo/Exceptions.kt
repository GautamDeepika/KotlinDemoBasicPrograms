package com.example.kotlindemo.kotlintutorialdemo

import java.lang.Exception

fun main() {
    //exceptions- Basically it is something which we don't want in our code
    // and whenever the unexpected thing happens in code which stops execution of our program.
    val age = 26
    try {
        getAge(age)
    } catch (e: Exception) {
        println(e)
    } finally {
        println("finally is called") // it is always called
    }
    println("program is running")
}

fun getAge(age: Int) {
    if (age < 30) {
        throw MyAgeException(age)
    }
}

class MyAgeException(val age: Int) : Exception("$age is not valid")