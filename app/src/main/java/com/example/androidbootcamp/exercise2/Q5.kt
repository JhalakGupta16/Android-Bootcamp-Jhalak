package com.example.androidbootcamp.exercise2

class Q5 {
    fun getGradeDetails(marks: Int): String {
        println("Your marks is $marks")
        return when(marks) {
            in 90..100 -> "WellDone"
            in 80..90 -> "Excellent"
            in 70..80 -> "Very Good"
            in 60..70 -> "Good"
            else -> "Invalid input"
        }
    }
}