package com.example.kotlindemo.kotlintutorialdemo.programs

class Armstrong {
    companion object {
        var remainderValue = 0
        var sum = 0
        fun toCheckForArmstrongNo(num: Int): String {
            var temp = num
            while (temp > 0) {
                remainderValue = temp % 10
                sum += remainderValue * remainderValue * remainderValue
                temp /= 10
            }
            return if (num == sum) "$num is Armstrong" else "$num is not Armstrong"
        }
    }
}

fun main() {
println(Armstrong.toCheckForArmstrongNo(153))
}

