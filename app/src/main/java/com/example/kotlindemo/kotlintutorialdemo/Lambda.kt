package com.example.kotlindemo.kotlintutorialdemo

fun main() {
    //lambda
    //lambda functions are the functions which have no name
    //normal functn eg
    println(square(5))

    //lets do same thing using lambda fun
    val squareOfNumber: (Int) -> Int = { number->
        number* number
    }
    println(squareOfNumber(6))

    val printName: (String)-> Unit = {
        println(it)
    }
    printName("Hritik")
}

//let create a fn which takes a no. and return square of that no.
fun square(num: Int) = num * num