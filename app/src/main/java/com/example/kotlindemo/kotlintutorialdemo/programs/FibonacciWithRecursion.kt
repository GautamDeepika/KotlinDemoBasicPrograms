package com.example.kotlindemo.kotlintutorialdemo.programs

import java.util.concurrent.CountDownLatch

fun main() {
    val fibonacciWithRecursion = FibonacciWithRecursion()
    print("${fibonacciWithRecursion.n1}   ${fibonacciWithRecursion.n2}")
    val count = 10
    fibonacciWithRecursion.fibonacciSeries(count - 2)
}

class FibonacciWithRecursion {
    //    companion object {
    var n1 = 0
    var n2 = 1
    var n3 = 0

    fun fibonacciSeries(count: Int) {
        if (count > 0) {
            n3 = n1 + n2
            n1 = n2
            n2 = n3
            print("  $n3")
            fibonacciSeries(count - 1)
        }
    }
//    }
}