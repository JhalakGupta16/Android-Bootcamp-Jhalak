package com.example.androidbootcamp.exercise2

class Q8 {
    // The HashSet class store elements using hashing mechanism.
    // It does not support duplicate value and does not make guarantees about the order sequence of element.
    val hashSet = hashSetOf("One", "Two", "Three", "Four")

    fun printHashSet() {
        println("Values in HashSet are: $hashSet")
    }
}