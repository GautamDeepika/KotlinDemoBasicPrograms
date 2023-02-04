package com.example.kotlindemo.kotlintutorialdemo

// Java program to illustrate
// for-each loop
internal object For_Each {
    @JvmStatic
    fun main(arg: Array<String>) {
        run {
            val marks = intArrayOf(125, 132, 95, 116, 110)
            val highest_marks = maximum(marks)
            println("The highest score is $highest_marks")
        }
    }

    private fun maximum(numbers: IntArray): Int {
        var maxSoFar = numbers[0]

        // for each loop
        for (num in numbers) {
            if (num > maxSoFar) {
                maxSoFar = num
            }
        }
        return maxSoFar
    }
}
