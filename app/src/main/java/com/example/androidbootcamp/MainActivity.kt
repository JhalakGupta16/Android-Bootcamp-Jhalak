package com.example.androidbootcamp

import com.example.androidbootcamp.exercise2.*

fun main() {

    println("Q1")

    val ob1 = Q1()

    ob1.Details()


    println("\nValue initialised from companion object")
    println("First name: ${Q1.fname}")
    println("Last name: ${Q1.lname}")
    println("Age: ${Q1.age}")


    println("\nQ2")
    val ob2 = Q2()
    ob2.addInt(3, 5)
    ob2.addDouble(10.5, 4.5)
    ob2.multiplyInt(4, 4)
    ob2.concatString("Hello ", "World")
    ob2.concatThreeStrings("This ", "is ", "Kotlin ")


    println("\nQ3")
    val ob3 = SBI()
    ob3.getBankDetails()
    val ob4 = BOI()
    ob4.getBankDetails()
    val ob5 = ICICI()
    ob5.getBankDetails()


    println("\nQ4")
    val ob6 = Q4()
    val ob7 = Q4()
    ob6.addBook("Intro to Android", 1, "Atul")
    ob7.addBook("Intro to Flutter", 2, "PAwan")
    ob6.getDetails()
    ob7.getDetails()


    println("\nQ5")
    val ob8 = Q5()
    println("Your grade: ${ob8.getGradeDetails(80)}")


    println("\nQ6")
    val ob9 = Q6()
    println("Original content in list: ${ob9.mList}")
    ob9.replaceSecondItem()


    println("\nQ7")
    val ob10 = Q7()
    ob10.makeAndPrintMap()


    println("\nQ8")
    val ob11 = Q8()
    ob11.printHashSet()
}

