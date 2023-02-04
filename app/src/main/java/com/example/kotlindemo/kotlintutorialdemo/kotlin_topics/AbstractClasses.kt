package com.example.kotlindemo.kotlintutorialdemo

fun main() {
    val window = Window()
    val mac = Mac()
    println(getOperatingSystem(window))
    println(getOperatingSystem(mac))
}

fun getOperatingSystem(computerOne: ComputerOne) = computerOne.operatingFunction()

abstract class ComputerOne() {
    abstract fun operatingFunction(): String
}

class Window() : ComputerOne() {
    override fun operatingFunction(): String {
        return "Windows"
    }
}

class Mac() : ComputerOne() {
    override fun operatingFunction(): String {
        return "Mac"
    }
}



