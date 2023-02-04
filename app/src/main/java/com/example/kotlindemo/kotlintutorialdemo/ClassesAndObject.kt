package com.example.kotlindemo.kotlintutorialdemo

fun main() {
    //class - a blueprint
    //object - implementation of the blue print

    val person = Person()
    val personTwo = Person()
    println(person.age)
    person.myAge(50)
    println(person.age)
    println(personTwo.age)
}

class Person {
    //property
    var age = 0

    //function
    fun myAge(myAge: Int) {
        age = myAge
    }
}