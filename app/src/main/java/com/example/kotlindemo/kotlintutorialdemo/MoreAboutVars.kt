package com.example.kotlindemo.kotlintutorialdemo

fun main() {
    var number = 10
    val numDouble = 10.0
    println(number)
    println(numDouble)
    //I want to print number and i also want to print double of this number like 10.0
    // because if i update this number then i have to update numDouble too
    //   so the other way is below
    // a certain set of variables can be converted and can be performed certain actions
    val num = 50
    val numberDouble = num.toDouble()
    println(num)
    println(numberDouble)
    println(num.toString())

    val num1 = 10
    val num2 = 20
    println(num1.plus(num2))
    println(num1.minus(num2))
    println(num1.times(num2))
    println(num2.div(num1))
    println(num2.rem(num1))
    var firstName = "Deepika"
    var lastName = "Gautam"
//    var fullName = firstName + " " + lastName
    var fullName = "$firstName $lastName" // concatenate in kotlin
    println(fullName)
    println(fullName.length) //chars in variable
    println(firstName[0])
    println(firstName.lowercase())
    // we want to write multi line one generic way is below:
    val line = "hghkbhkbhkbhbhbhkbhkbhbh \n mhvgjvjvgjvjvhjbhjbhjbhjb"
    println(line)
    // but in kotlin :
    val lineone = """
                   hello
                   how are
                   you 
                   my 
                   friend
                    """.trimIndent()
    println(lineone)
}