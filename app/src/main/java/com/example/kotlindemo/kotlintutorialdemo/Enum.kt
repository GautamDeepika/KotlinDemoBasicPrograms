package com.example.kotlindemo.kotlintutorialdemo

fun main(){
    val studentOne = Student("Himani", StudentType.FEMALE)
    val studentTwo = Student("Himanshu", StudentType.MALE)

    for (type in StudentType.values()){
        println(type)
        println(type.name)
        println(type.ordinal)
    }
}

class Student(val name: String, val type: StudentType){
    init {
        println("$name is ${type.type}")
    }
}

//male/female
enum class StudentType(val type: String){
    MALE("male"),
    FEMALE("female")
}