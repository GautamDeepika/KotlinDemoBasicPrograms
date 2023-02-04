package com.example.kotlindemo.kotlintutorialdemo.programs

fun main() {
    val palindrome = Palindrome()
    println(palindrome.toCheckPalindromeString("Radar"))
    println(palindrome.toCheckPalindromeNumber(292))


}

class Palindrome {

    fun toCheckPalindromeString(string: String): String {
        var reverseString: String = ""
        val strLength = string.length

        for (i in strLength - 1 downTo 0) {
            reverseString += string[i].toString()
        }
        println(" $reverseString")
        println("reversed String:   ${string.toLowerCase()}")
        println("original string:   ${reverseString.toLowerCase()}")
        return if (string.toLowerCase().equals(reverseString.toLowerCase())) {
            "$string is palindrome"
        } else {
            "$string is non palindrome"
        }
    }

    fun toCheckPalindromeNumber(num: Int): String {
//        val originalNum = num
        var number = num
        var reversedNum = 0
        while (number != 0) {
            reversedNum = reversedNum * 10 + number % 10
            number /= 10
        }
        return if (num == reversedNum) "$num is palindrome" else "$num is non palindrome"
    }


}