package com.example.kotlindemo.kotlintutorialdemo

fun main() {
    //data class - class to hold data
    val userOne = User("Himanshu")
    val userTwo = User("Himanshu")

    println(userOne) //-  different instances
    println(userTwo) //-  different instances

    println(userOne == userTwo)
    println(userOne.userName)
    println(userOne.component1()) // it will print first parameter its constructor have
    println(userOne.component2()) // it will print first parameter its constructor have

    val userThree = userOne.copy(age = 45)
    println(userThree)

    // to destructor data class
    val (uName, age) = userOne
    println(uName)
    println(age)
}

data class User(val userName: String, val age: Int = 50) {

}