package com.example.kotlindemo.kotlintutorialdemo

fun main() {
    //set is like list
    val name = setOf("MindOrks", "afterAcademy", "afterAcademy")
    val cities = mutableSetOf("paris", "delhi", "MindOrks")
    println(name) // Set prints unique values
    println(cities)

    cities.add("mumbai")
    println(cities)
    println(cities.contains("paris"))
    println(name union cities)
    println(name intersect  cities)
    println(name.count())
    println(name.size)
}