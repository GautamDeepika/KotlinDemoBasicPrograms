package com.example.kotlindemo.kotlintutorialdemo.programs.patterns_programs

fun main() {
    val row=6
    for (i in 0 until row){
        for (j in 0 .. i){
            print("* ")
        }
        println()
    }
}