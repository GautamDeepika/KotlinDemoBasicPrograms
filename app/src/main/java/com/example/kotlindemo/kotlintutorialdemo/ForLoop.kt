package com.example.kotlindemo.kotlintutorialdemo

fun main(){
    //loops - going through again and again until condition is matched
    //for / while
    for (num in 0..100){
        println(num)
    }
    for (num in 0 until 100){
        println(num)
    }
    for (num in 0 until 100 step 5){
        println(num)
    }
    for (num in 100 downTo 0 step 5){
        println(num)
    }
    val list =  listOf("Himanshu", "amit", "simran", "raj")
    for (item in list){
        println(item)
    }
    //index value
    for (index in list.indices){
        println(index)
        println(list[index])
    }
    for ((index, value) in list.withIndex()){
        println(index)
        println(value)
    }

}