package com.george

fun main() {
//    println("Hello kotlin")
//    Human().hello()
    val h = Human()//一個物件產生
    h.hello()
}

class Human{
    fun hello(){
        println("Hello kotlin")
    }
}