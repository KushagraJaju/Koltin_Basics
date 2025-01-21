package com.example.koltinbasic

fun main (){
    var myCar = Car()
    println("Brand is : ${myCar.myBrand}")
    println("Maxspeed is ${myCar.maxSpeed}km/h")
    println("Model is ${myCar.myModel}")
}

class Car(){
    lateinit var owner : String

    val myBrand: String = "BMW"
        get(){
            return field.toLowerCase()
        }

    var maxSpeed: Int = 350
        // Backing field helps you refer to the property inside the getter and setter methods.
        /* This is required because if you use the property directly inside the getter
        or setter then you’ll run into a recursive call which will generate a StackOverflowError.*/
        get() = field

        /* We use value as the name of the setter parameter. This is the default convention
        in Kotlin but you’re free to use any other name if you want.*/
        /* The value parameter contains the value that a property is assigned to.
        For example, when you write user.name = "Elon Musk", the value parameter contains
        the assigned value "Elon Musk".*/
        set(value){
            field = if (value > 0) value else throw java.lang.IllegalArgumentException("Maxspeed can't be less than zero")
        }

    var myModel : String = "X6"
        //private makes it only available to the class not the function, its private
        //if setter is private u cant set the value but u can get it
        private set

    init {
        //in the initializer i can change the value for a private setter
        this.myModel = "M5"
        this.owner = "Franky"
    }
}