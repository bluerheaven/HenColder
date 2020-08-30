package com.example.app.entity

val user = User("AA", "BB", "CC")
val userCopy = user.copy()

fun main() {
    print(user)
    print(userCopy)
    print(user == userCopy)
    print(user === userCopy)

    repeat(100) {
        //print(it)
    }

    for (i in 0..99) {

    }

    val array = arrayOf(1, 23, 44, 5, 6, 7, 0)
    for (i in 0.until(100)) {

    }
}
