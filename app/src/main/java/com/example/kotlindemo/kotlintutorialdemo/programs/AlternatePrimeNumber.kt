package com.example.kotlindemo.kotlintutorialdemo.programs

object AlternativePrimeNum {
    @JvmStatic
    fun main(args: Array<String>) {
        val num = 100
        print("Alternative prime numbers up to $num are: ")
        printAlternativePrimeNo(num)
    }

    fun checkPrimeNo(num: Int): Int {
        var flag = 0
        for (i in 2..num / 2) {
            if (num % i == 0) {
                flag = 1
                break
            }
        }
        return if (flag == 0) 1 else 0
    }

    private fun printAlternativePrimeNo(n: Int) {
        var temp = 2
        for (num in 2..n) {
            if (checkPrimeNo(num) == 1) {
                if (temp % 2 == 0) print("$num ")
                temp++
            }
        }
    }
}
