package com.example.kotlindemo.kotlintutorialdemo

import java.util.*

class Kotlin {
    val result: String = Utils.doSomething()

    val eventOne = EventClass(name = "MindOrks")
    private val yesterdayDate = Date(Date().time.minus(24 * 60 * 60 * 1000L))
    val eventTwo = EventClass(name = "MindOrks", date = yesterdayDate)
    val date = eventOne.date
}