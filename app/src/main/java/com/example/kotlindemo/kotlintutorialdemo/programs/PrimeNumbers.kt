package com.example.kotlindemo.kotlintutorialdemo.programs

fun main() {
    val num = 4
    var flag: Boolean = false
    var i = 2
    for (i in i until num) {
        //condition for non prime number
        if (num % i == 0) {
            flag = true
            break
        }
    }

    if (flag){
        print("$num is not a prime number")
    }else{
        print("$num is a prime number")
    }
}