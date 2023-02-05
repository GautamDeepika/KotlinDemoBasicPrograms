package com.example.kotlindemo.kotlintutorialdemo.programs

import java.util.*

object LargestNoOutOfThree {
    @JvmStatic
    fun main(args: Array<String>) {
        val a: Int
        val b: Int
        val c: Int
        val temp: Int
        val largest: Int
        val scanner = Scanner(System.`in`)
        println("Enter the first number:")
        a = scanner.nextInt()
        println("Enter the second number:")
        b = scanner.nextInt()
        println("Enter the third number:")
        c = scanner.nextInt()
        temp = if (a > b) a else b
        largest = if (c > temp) c else temp
        print("Largest number is $largest")
    }
}