package com.example.androidbootcamp.Exercise4

class Q1 {
    val simpleInterest = {principal: Int, time: Int, rate: Int ->
        println("Simple interest for Rs. $principal, Duration: $time years and Interest rate: $rate is: Rs. " + (principal*rate*time)/100)
    }
}