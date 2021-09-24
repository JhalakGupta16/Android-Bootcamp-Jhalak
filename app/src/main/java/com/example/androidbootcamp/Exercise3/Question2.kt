package com.example.androidbootcamp.Exercise3

sealed class Question2{
    val msg = "Hello World!"


    fun getClass(base: Question2) {
        println("This is called from object of ${base.javaClass}")
    }
}

class A: Question2(){
}

class B: Question2(){
}

class C: Question2(){
}