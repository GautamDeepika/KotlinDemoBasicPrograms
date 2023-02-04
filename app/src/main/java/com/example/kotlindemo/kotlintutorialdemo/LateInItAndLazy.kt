package com.example.kotlindemo.kotlintutorialdemo

fun main() {
    val declaration = Declaration()
    declaration.setValue("Himani")
    println(declaration.getValue())
    //when we create an object in kotlin then memory gets allocated by default to that object
//    val userDetail = UserDetail("atul", 20)
    val userDetail : UserDetail by lazy { UserDetail("atul", 20) }
}

//use of lateinit
class Declaration {
    lateinit var myName: String

    fun setValue(name: String) {
        myName = name
    }

    fun getValue() = if (::myName.isInitialized) myName else "not initialised"
}

//use of lazy
class UserDetail(val name: String, val age: Int) {
    init {
        println("the name is $name")
        println("the age is $age")
    }
}