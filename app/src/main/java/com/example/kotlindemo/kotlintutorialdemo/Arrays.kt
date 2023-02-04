package com.example.kotlindemo.kotlintutorialdemo

import java.util.*

fun main() {
    //arrays in kotlin
    //collection of similar type of data
    //type - string, Int, custom, any
    // fixed size -  fixed set of values

    var array = arrayOf(1, 4, 3, 34, 55, 20, 2)
    var array1 = arrayOf(1, 2, 3, "Himanshu")
    println(Arrays.toString(array))
    println(Arrays.toString(array1))
    println(array[0])
    println(array1[3])
    array[0] = 10
    println(Arrays.toString(array))
    println(array.first())
    println(array.last())
    array.set(2, 30)
    println(Arrays.toString(array))
    println("index value of himanshu is ${array1.indexOf("Himanshu")}")

    val sumOfArray = array.sum()
    println(sumOfArray)
    println("............................................")
    println(array.maxOrNull())
    println(array.minOrNull())
    println("count is  ${array.count()}")
    val sortedArray = array.sortedArray()
    println(Arrays.toString(sortedArray)) // ascending order
    // where we need to find an element which is divisible by 10
    val number = sortedArray.find {
        it % 2 == 0
    }
    println("number is $number")
}
