package com.example.kotlindemo.kotlintutorialdemo.programs

fun main() {
    var n1=0
    var n2=1
    var n3=0
    var loopStartValue =2
    val count = 10
    print("$n1   $n2")
    for (i in loopStartValue until count){
        n3= n1+n2
        print("   $n3")
        n1= n2
        n2= n3
    }
}

