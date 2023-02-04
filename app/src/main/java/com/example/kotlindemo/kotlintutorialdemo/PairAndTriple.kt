package com.example.kotlindemo.kotlintutorialdemo

fun main() {
    //pair- collection of 2 variables
    //triple- collection of 3 variables

    var pair = Pair<String, Int>("Himanshu", 26)
    var pairTwo = Pair<String, String>("Himanshu", "26")

    var (firstName, secondName) = Pair("Himani", "Singh")
    println(pair)
    println(pair.first)
    println(pair.second)
    println(firstName)
    println(secondName)
    //to convert in list
    var list = pair.toList()
    println(list[0])
    println(list[1])


    //triple
    val triple = Triple("Himanshu", "Asif", 26)
    println(triple.first)
    println(triple.second)
    println(triple.third)
    val (fName, sName, age) = Triple("Himanshu", "Asif", 26)
    println(fName)
    println(sName)
    println(age)

    //to convert in list
    val listFromTriple = triple.toList()
    println(listFromTriple[0])
    println(listFromTriple[1])
    println(listFromTriple[2])
}