package com.example.koltinbasic

data class User(val id: Long, var name: String)

fun main(){
    val user1 = User(1,"MyHello")

    val  user2 = User(1,"YourHello")

    println(user1 == user2)

    println("User Details : $user1")
    println("User Details : $user2")

    //copy function then we set to change the name only and copy the rest
    val updatedUser = user1.copy(name="Lenovo Pamjuta")
    println(user1)
    println(updatedUser)

    //component 1 is id
    println(updatedUser.component1())//print 1
    //component 2 is name
    println(updatedUser.component2()) // print Lenovo Pamjuta

    val (id,name) = updatedUser
    println("id = $id,name = $name")
}