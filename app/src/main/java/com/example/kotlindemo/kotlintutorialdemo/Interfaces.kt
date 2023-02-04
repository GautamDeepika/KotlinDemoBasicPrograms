package com.example.kotlindemo.kotlintutorialdemo

fun main() {
    val windows = Windows()
    println(windows.operatingSystem())
    println(windows.buildYear())
    println(windows.buildBy())
}

interface NewComputer {
    fun operatingSystem(): String
    fun buildYear(): Int

    fun buildBy() = "ABC"
}
interface Type{
    fun dummyType()
}

class Windows() : NewComputer, Type {
    override fun operatingSystem(): String {
        return "Windows"
    }

    override fun buildYear(): Int {
        return 2001
    }

    override fun dummyType() {

    }

}