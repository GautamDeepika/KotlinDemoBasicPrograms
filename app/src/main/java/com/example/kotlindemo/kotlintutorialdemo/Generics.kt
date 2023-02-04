package com.example.kotlindemo.kotlintutorialdemo

fun main() {
    Event<String, Int>("Himanshu", 22)
    Event(256, "jhbhbh")
    Event(true, true)
    Event<String, String>(data = "fjfjnv")
}

class Event<T, V>(value: T? = null, data: V) {
    init {
        if (value != null) {
            println(value.toString().length)
        } else {
            print("Empty parameter")
        }
    }

}