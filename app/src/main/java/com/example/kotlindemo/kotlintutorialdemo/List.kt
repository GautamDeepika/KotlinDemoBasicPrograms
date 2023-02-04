package com.example.kotlindemo.kotlintutorialdemo

fun main() {
    //list are like dynamic arrays
    //inc/dec size
    //two types- mutable and immutable
    //val-var

    val listOne = listOf(1, 2, 3, 4)
    val listTwo = mutableListOf(5, 6, 7, 8)
    println(listOne)
    println(listTwo)
    println("..........................")
    //can't add in listOne
//    listOne.add  because it is immutable
    listTwo.add(9)
    listTwo.add(10)

    println(listOne[0])
    println(listTwo[0])
    println(listTwo)
    println("..........................")
    listTwo.remove(7)
    println(listTwo)
    println(listTwo.contains(6))
    println("..........................")
    val element = listTwo.find {
        it % 2 == 0
    }
    println(element)
    println("..........................")
    val item = listTwo.filter {
        it % 2 == 0
    }
    println(item)
    println("..........................")
    val newList = listOne.map {
        it * it
    }
    println(newList)
    println("..........................")
    println(listTwo)
    val evenList = listTwo.filter {
        it % 2 == 0
    }
    println(evenList)
    println("..........................")
    println(listTwo)
    var oddList = listTwo.filter {
        it % 2 != 0
    }
    println(oddList)
    println("..........................")
    println(listTwo)
    oddList = listTwo.filterNot {
        it % 2 == 0
    }
    println(oddList)
    println("..........................")
    //slices
    //position-index
    println(listOne)
    val newOneList = listOne.slice(0..2)
    println(newOneList)
    val subList = listOne.subList(0, 2)
    println(subList)
    val take = listOne.take(3)
    println(take)
    val takeLast = listOne.takeLast(2)
    println(takeLast)
    println("..........................")
//    println(listOne[8]) it will throw IndexOutOfBoundsException
    //we want no exception if index is not present
    println(listOne.elementAtOrNull(8))
    println(listOne[0])
    println("..........................")
//to create empty list
    val eList = emptyList<Int>()
    println(eList)
    println(eList.isEmpty())
    println(listOne.isEmpty())
//    to sort a list
    println(listTwo)

    println(listTwo.sort())
}