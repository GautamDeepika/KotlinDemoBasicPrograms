package com.example.kotlindemo.kotlintutorialdemo

fun main() {
    //conditional statement
    //if certain condition is true, do 'this' or do 'that'

    //in kotlin we have if-else or when
    var age = 35
    // we want to see if age is even or odd no
    if (age % 2 == 0) {
        println("Age=  $age is even")
    } else if (age == 35) {
        println("Age= $age is 35")
    } else {
        println("Age=  $age is odd")
    }

    //using when
    when {
        age % 2 == 0 -> {
            println("Age=  $age is even")
        }
        age == 35 -> {
            println("Age= $age is 35")
        }
        else -> {
            println("Age=  $age is odd")
        }
    }

    when (age) {
        1 -> println("Age is 1")
        35 -> println("Age is 35")
        else -> println("Age is undefined")
    }

    var agE = 20
    when(agE){
        in 10..20 -> println("Teenage")
        in 21..50 -> println("Adult")
        else -> println("Old")
    }


}