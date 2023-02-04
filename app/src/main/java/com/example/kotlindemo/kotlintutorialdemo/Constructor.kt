package com.example.kotlindemo.kotlintutorialdemo

fun main() {
    //constructor - is also a member function but it gets called whenever we create an object
    // whenever we create an object then specific member function gets called

    val person = PersonOne("Raj Kapoor")
    val personTwo = PersonOne(50)
    val personThree = PersonOne("Raj Kapoor", "Delhi")
//    println(person.myAge)
//    println(person.userName)
}

//primary constructor
class PersonOne(){            //    (val age: Int, val fNAme: String, val lName: String) {
    //secondary constructor
//    constructor(fullName: String = "Simran"):this(0,fullName,""){
//        userName = fullName
//    }
    constructor(fullName: String) : this() {

    }
    constructor(age: Int) : this() {

    }
    constructor(userName: String, address: String) : this() {

    }

    //property
//    var myAge = age
//    var userName = "$fNAme $lName"
}