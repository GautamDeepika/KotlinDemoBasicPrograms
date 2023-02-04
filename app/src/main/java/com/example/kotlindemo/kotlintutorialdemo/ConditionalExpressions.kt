package com.example.kotlindemo.kotlintutorialdemo

import java.lang.StringBuilder

//conditional expressions = && and  ||
fun main() {
    var age = 20
//    if (age < 20) {
//        println("KID")
//    } else if (age > 20 && age < 50) {
//        println("ADULT")
//    } else {
//        println("OLD")
//    }
    if (age < 20) {
        println("KID")
    } else if (age in 21..50) {
        println("ADULT")
    } else {
        println("OLD")
    }

    var agE = 30
//    var type: String
//    if (age <= 20) {
//        type = "KID"
//    }else if (age in 21..50) {
//        type = "ADULT"
//    }else{
//        type = "OLD"
//    }
//    println(type)
    val type: String = when(agE) {
       10 ->  "KID"
        20-> "ADULT"
        else -> "NO VALID AGE IS FOUND"
    }
    println(type)
}