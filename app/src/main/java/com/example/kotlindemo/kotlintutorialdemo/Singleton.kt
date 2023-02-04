package com.example.kotlindemo.kotlintutorialdemo

fun main() {
//singleton - same instance through out
    // we can't instantiate singketon object
    //it can't have constructor

//    val profile = UserProfile()
//    val profileTwo = UserProfile()
//    println(profile.toString()) // this is different object
//    println(profileTwo.toString())  // this is different object

    println(UserProfile.toString())
    println(UserProfile.toString())
    println(UserProfile.add(1, 5))
    println(UserProfile.add(31, 12))
}

//class UserProfile {}

object UserProfile {
    fun add(num1: Int, num2: Int) = num1.plus(num2)
}