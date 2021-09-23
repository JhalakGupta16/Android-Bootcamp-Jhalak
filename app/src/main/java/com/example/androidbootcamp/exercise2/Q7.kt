package com.example.androidbootcamp.exercise2

class Q7 {
    fun makeAndPrintMap() {
        val mMap = mutableMapOf<Int, String>(Pair(1, "hello"), Pair(2, "world"), Pair(3, "map"))
        for (item in mMap) {
            println("Key: ${item.key}, Value: ${item.value}")
        }
    }
}