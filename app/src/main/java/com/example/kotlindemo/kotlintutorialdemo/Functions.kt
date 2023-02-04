package com.example.kotlindemo.kotlintutorialdemo

fun main() {
    //functions
    sayHi()
    sayHi("Shivangi")
    println(sayHey()) // here i want to print a string value
    // to return some certain set of value from a function

    //how to declare a function -
    //fun name(): ReturnType {
    //    task
    //    return the value
    //    }

    fullName("Shivangi", "Malhotra")
    println(name("Shivangi", "Chauhan"))

    // till now we have learnt that how to create a function and return a value from a function
    println(add(10, 20))

    //default parameters
    println(greetings("hello"))
    println(greetings("Hey", "Himanshu"))
    println(greetings("How are you?", "hbhbkhbk"))
    println(greetings("How are you?", "Amit"))

    //named parameters
    println(greetings())
    println(greetings("amit"))
    println(greetings(name = "amit"))
    println(greetings(name = "Raj", greet = "Hello"))

    //single expression function
    println(greeting())


}

fun sayHi() {    // without parameter
    println("Hey")
}

fun sayHi(name: String) {   // parameterised function  - if return type is ": Unit" it means it returns nothing
    println(name)
}

fun sayHey(): String {
    return "Hey"
}

fun fullName(firstName: String, lastName: String) {
    val fName = "$firstName $lastName"
    println(fName)
}

fun name(firstName: String, lastName: String): String {
    val fName = "$firstName $lastName"
    return fName
}

fun add(num1: Int, num2: Int): Int {
    return num1.plus(num2)
}

//default parameters
fun greetings(greet: String = "Hi!!", name: String = "Himanshi"): String {
    return "$greet $name"
}

//single expression function
fun greeting(greet: String = "Hi!!", name: String = "Himanshi"): String = "$greet $name"
