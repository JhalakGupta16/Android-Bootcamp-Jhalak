package com.example.androidbootcamp.exercise2

class Q6 {
    val mList = mutableListOf<Int>(1, 8, 3, 4)

    fun replaceSecondItem() {
        mList[1]  = 2
        printList()
    }

    private fun printList() {
        println("Updated content in list: $mList")
    }
}