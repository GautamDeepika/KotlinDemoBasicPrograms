package com.example.kotlindemo.kotlintutorialdemo

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    //maps- key/value pairs
    val ageMapper = mapOf("himanshu" to 26, "john" to 30)
    println(ageMapper)
    println(ageMapper["himanshu"])
    println(ageMapper.size)
    println(ageMapper.count())
    println(ageMapper.count {
        it.value > 28
    })

    val newAgeMapper = mutableMapOf("himanshu" to 26, "atul" to 50)
    newAgeMapper.put("simran", 25)
    println(newAgeMapper)
//    newAgeMapper.clear()
    newAgeMapper.remove("himanshu")
    println(newAgeMapper)
    println(newAgeMapper.containsKey("simran"))
    println(newAgeMapper.containsValue(26))
    println(newAgeMapper.filter {
        it.value == 50 || it.key == "simran"
    })
    println(newAgeMapper.filterKeys {
        it == "simran"
    })
    println(newAgeMapper.filterValues {
        it == 50
    })
    println(newAgeMapper.toSortedMap()) // sorted on the basis of key
//    println(newAgeMapper.get("hbhcdbhdbc")) // it will throw exception because it returns null
    println(newAgeMapper.getOrDefault("bjnjnjdcnjnd", -1))
    println(newAgeMapper.keys)
    println(newAgeMapper.values)
}