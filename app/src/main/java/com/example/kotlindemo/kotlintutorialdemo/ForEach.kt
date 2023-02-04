package com.example.kotlindemo.kotlintutorialdemo

fun main() {
    val list = listOf("himanshu", "amit", "simran", "raj")

    //forEach
    list.forEach { name ->
//        println(name)
        if (name == "simran")
            println(true)
    }
    list.forEachIndexed{index, name ->
    println(index)
    println(name)
    }
}