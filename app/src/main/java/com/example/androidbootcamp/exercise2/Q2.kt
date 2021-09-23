package com.example.androidbootcamp.exercise2

interface PerformActions {

    fun addInt(x: Int, y: Int)

    fun addDouble(x: Double, y: Double)

    fun multiplyInt(x: Int, y: Int)

    fun concatString(str1: String, str2: String)

    fun concatThreeStrings(str1: String, str2: String, str3: String)
}

class Q2: PerformActions {
    override fun addInt(x: Int, y: Int) {
        println("Sum of Int = ${x+y}")
    }

    override fun addDouble(x: Double, y: Double) {
        println("Sum of Double = ${x+y}")
    }

    override fun multiplyInt(x: Int, y: Int) {
        println("Mutiplication of Int = ${x+y}")
    }

    override fun concatString(str1: String, str2: String) {
        println("Two concatenated strings = ${str1.plus(str2)}")
    }

    override fun concatThreeStrings(str1: String, str2: String, str3: String) {
        println("Three concatenated strings = ${str1.plus(str2).plus(str3)}")
    }


}