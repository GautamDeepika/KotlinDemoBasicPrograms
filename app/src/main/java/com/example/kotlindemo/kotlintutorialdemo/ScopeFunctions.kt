package com.example.kotlindemo.kotlintutorialdemo

/*scope functions-
-let   -  (it)   - return result
-run   -  (this) - return result
-also  -  (it)   - return same object
-apply -  (this) - return same object
*/

fun main() {
//.........................let scope function eg...................................................
    val numbers = mutableListOf("one", "two", "three", "four", "five")

    numbers.map {
        it.length
    }.filter {
        it > 3
    }.let {
        println(it)
    }
//    to perform null check we can use let
    val nullableString: String? = "null"
    nullableString?.let {
        println(it)
    }
    //old generic way is
    if (nullableString != null) {
        println(nullableString)
    }

    //.........................run scope function eg...................................................
    val info = PersonNew("Amir", "khan").run {
        this.address = "xyz"
        this.getInfo()
    }
    println(info)
    //.........................apply scope function eg...................................................
    val personOne = PersonNew("Atul", "Sharma").apply {
        address = "xyz"
        phoneNumber = "123"
        getInfo()
    }
    println(personOne.toString())
    //.........................also scope function eg...................................................
    val mappedResult = numbers.map { it.length }
        .also {
            println(it)
        }.filter {
            it > 3
        }
    println(mappedResult)
}

//.........................run scope function eg & apply scope function eg................................

class PersonNew(val fName: String, val lName: String) {
    var address: String = "unknown"
    var phoneNumber: String = "unknown"
    fun getInfo() = " first name = $fName \n last name = $lName \n address = $address"

    override fun toString(): String {
        return "$fName $lName $address $phoneNumber"
    }
}