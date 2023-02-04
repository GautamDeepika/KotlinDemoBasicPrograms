package com.example.kotlindemo.kotlintutorialdemo

fun main() {
    //nullable in kotlin- means working with null values
    var name = "Shilpa"
    var fName: String? = "Shilpa"
    println(fName)
//    fName = null - fName has a value so it can't store null value
//    if you want to store null value in it you have to make it nullable- "?"
    fName = null
    println(fName)
    println("..........................................................................")
    var fullName: String? = "Himanshu Singh"

    println(fullName?.length) // here fullName?. checks if it has null value it will return null
    // if doesn't have null value it would return length
    fullName = null
    println(fullName?.length)
    println("..........................................................................")
    if (fullName != null)
        println("not null")
    else
        println(" null")
    println("..........................................................................")
    var length = if (fullName != null) fullName?.length else 0
    println(length)
    //elvis operator
    length = fullName?.length ?: 0
    println(length)
//    if fName is null then it will print right side of elvis operator
//    else it will print left side that is length

}