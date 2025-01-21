package com.example.koltinbasic

import android.annotation.SuppressLint

fun main(){
    var hello = Person("Hello", "World",12)
    // we assign the hobby as To skateboard for the variable hello
    hello.hobby = "To Skateboard"
    hello.age = 32
    println("Hello is ${hello.age} years old")
    // We say to state the hobby of hello the variable
    hello.stateHobby()

    var john = Person()
    john.hobby = "Play Video games"
    john.stateHobby()
}

//Constructor allows us to add values to our objects when we crt a object of our class like names ( its not mandatory )
// if we put a equals sign (=) after the assigned type it is the default value if not typed
class Person (firstName: String = "John", lastName: String = "Doe"){

    //member variables - Properties
    var age : Int? = null
    var hobby : String = "watch Kotlin"
    var firstName : String? = null

    //defining of the blue print
    // this is the initializer called after the object is called
    init {
        this.firstName = firstName
        println("Initialized a new person object with firstName = $firstName and lastName = $lastName")
    }

    // member secondary constructor

    constructor(firstName: String, lastName: String, age: Int): this (firstName, lastName){
        //this , this says that the first name and last name should be taken from our primary constructor

        //age given to the object should be assigned to this class which is variable age which is kept null
        this.age = age
        println("Initialized a new person object with firstName = $firstName and lastName = $lastName and age $age")

    }

    //Member functions - Methods
    fun stateHobby(){
        println("$firstName\'s hobby is $hobby")
    }

}