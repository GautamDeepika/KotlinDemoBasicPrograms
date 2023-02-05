package com.example.kotlindemo.kotlintutorialdemo.programs

fun main() {
    val number = 54321
    var tempNo = number
    var reverseNo = 0
    while (tempNo > 0) {
        reverseNo = reverseNo * 10 + tempNo % 10
        tempNo /= 10
    }
    println(tempNo)
    println(reverseNo)
}