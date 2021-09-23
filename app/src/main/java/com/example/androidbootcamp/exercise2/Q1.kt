package com.example.androidbootcamp.exercise2

// Companion object make it public static
// So we can access it just as using ClassName.propertyName
class Q1{

companion object {
    const val fname = "Shrishti"
    const val lname = "Arora"
    const val age = 25
}

var fname: String? = null
var lname: String? = null
var age: String? = null

// init will initialise values
init {
    fname = "Jhalak"
    lname = "Gupta"
    age = "25"

}


fun Details() {
    println("Value initialised from init block")
    println("First name: $fname")
    println("Last name: $lname")
    println("Age: $age")
}

}