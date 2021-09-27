package com.example.androidbootcamp.Exercise4

data class Employee(val name: String, val age: Int)

class Q2 {
    private val employeeList = listOf(
        Employee("Shubham", 23),
        Employee("Gaurav", 35),
        Employee("Pawan", 40),
        Employee("Saurabh", 32),
        Employee("Ram", 24),
        Employee("Mayank", 44)
    )

    fun createFilteredList(){
        val ageFilteredList = employeeList.filter {
            (it.age > 30)
        }

        ageFilteredList.forEach {
            println("Name: ${it.name}, Age: ${it.age}")
        }
    }
}