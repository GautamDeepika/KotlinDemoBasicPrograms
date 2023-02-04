package com.example.kotlindemo.kotlintutorialdemo

fun main() {
    //- for single line comments
    /*
    - for
    multiline comments
    but basically we use single line comments
    and the lines which we commented does not get executed or compiled by the IDE
    at run time
    comments are basically used in writing documents
    or for some other developers to understand  why we actually wrote this code
    */
    //variables - is basically a container

    var name = "Ram"
    println(name)
    val age = 26
    println(age)

    name = "Ravan"
    println(name)

//    age = 30       ----  we can't change the value because Val can't be reassigned.
//    println(age)
}