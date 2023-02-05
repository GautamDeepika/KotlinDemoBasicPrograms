package com.example.kotlindemo.kotlintutorialdemo.programs

object PerfectSquare {
    @JvmStatic
    fun main(args: Array<String>) {
        val num = 12
        var flag = 0
        val loopLength = num / 2
        for (i in 1..loopLength) {
            if (num == i * i) {
                flag = 1
                break
            }
        }
        if (flag == 1) {
            println("$num is perfect square")
        }else{
            println("$num is not a perfect square")
        }
    }
}