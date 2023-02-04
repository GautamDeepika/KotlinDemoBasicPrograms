package com.example.kotlindemo.kotlintutorialdemo

fun main() {
    var name = "Himanshu"
    name = "MindOrks"

    /*
    name = 26  --  kotlin assumes its data type by its value.
    we can assign or declare with specific type so that we can understand
    that it can only take value of specified type
    */

    var byte: Byte = 0   //8bit
    var short: Short = 0  //16 bit
    var int: Int = 0      //32 bit
    var long: Long = 0L    //64 bit
    var float: Float = 0f    //32 bit
    var double: Double = 0.0    //64 bit

    //strings
    var string: String = "string"
    var char: Char = 'a'

    //booleans
    var boolean: Boolean = false

    println(byte)
    println(short)
    println(int)
    println(long)
    println(float)
    println(double)
    println(string)
    println(char)
    println(boolean)
}