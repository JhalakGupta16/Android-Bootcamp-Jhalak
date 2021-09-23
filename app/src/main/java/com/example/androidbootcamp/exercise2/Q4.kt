package com.example.androidbootcamp.exercise2

abstract class Library {
    var bookName: String = ""
    var bookID: Int = 0
    var bookAuthor: String = ""

    abstract fun addBook(bkName: String, bkID: Int, bkAutor: String)

    abstract fun getDetails()
}

class Q4: Library(){

    override fun addBook(bkName: String, bkID: Int, bkAutor: String) {
        bookName = bkName
        bookID = bkID
        bookAuthor = bkAutor
    }

    override fun getDetails() {
        println("Book id: $bookID")
        println("Book name: $bookName")
        println("Book author: $bookAuthor\n")
    }
}