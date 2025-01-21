package com.example.koltinbasic

//entry point of the code if nothing is there in it nothing is executed
fun main() {
    println("Hello, world!!!")
    // This is a comment. Comments start with //
    // val is used for variables which are immutable (not changeable)
    val myName = "Denis"
    // myName = "Michael" // ERROR: *Val cannot be reassigned*

    /* This is a multi line comment starts with /* and ends with */ without the
     var is used for variables which are mutable/changeable.
     kotlin is a strongly typed language that supports Type Inference.
     The compiler will directly assume the size and type to a variable by that.
     For example, if you assign any whole number to a variable,
     the compiler will directly assume that the variable is of type Int */

    var myAge = 31 // var can be reassigned

    // Integer TYPES: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 12_039_812_309_487_120

    // Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.141592653589793

    // Booleans the type Boolean is used to represent logical values.
    // It can have two possible values true and false.
    var isSunny: Boolean = true
    // not sunny anymore...
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    // Arithmetic Operators (+ , -, *, /, %)
    // Modulus % gives us remainder
    var result = 5+3
    result /= 2
    println(result)

    /*Comparison Operators { == (EqualTo) , != (NotEqualTo), < (LessThan)
    > (GreaterThan), <= (LessThan or EqualTo), >= (GreaterThan or EqualTo) }
    */
    val isEqual = 5==3
    println("isEqual is $isEqual")

    //Assignment operators ( {x += y}means x = x+y , {x *= y}means x = x*y )
    //(+= , -=, *=, /=, &= )
    var myNum = 5
    myNum += 3
    println("myNum is $myNum")

    //Increment & Decrement operators ( ++, -- )
    myNum++
    println("myNum is $myNum")
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")
    println("myNum is ${--myNum}")

    //if else statement format ::::::
    //if (condition) { println() }    ---------- First Condition
    //else if (condition) { println() }       ----- U can have as many as u want
    // else { println() }       -----------  If all condition fail this executes
    //if one condition is true is bypass the others and if not then the next one goes top to bottom
    var heightp1 = 170
    var heightp2 = 190
    if (heightp1>heightp2) {
        println("Yes its true")
    }else {
        println("Yes its false")
    }

    //When statement it executes line by line its a easier way of if statement
    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")

    }

    var month = 3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Season")
    }


    /* ! before in says that if the person is less than zero or older than 20 then
    execute that condition */
    var age = 17
    when(age) {
        // with the !in it's the same as saying not in the range
        !in 0..20 -> println("now you may drink in the US")
        in 18..20 -> println("now you may vote")
        16, 17 -> println("you now may drive")
        else -> println("you're too young")
    }

    //Any means the type of the variable is anything
    var x : Any = 13.37
    // Now we use the when statement to find what type of variable it is
    when (x){
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }


    /* While loop executes a block of code repeatedly as long as the given condition is true
    Format while(condition) {code to be executed} */
    var x1 = 1
    while(x1 <= 10) {
        //code to be executed
        println("$x1")
        x1++
    }
    // For a line break add \n before the line to be broken
    println("While loop is done")


    /* When do u use a Do while loop ---- so in this first it tells to do the stuff and then check
    if the while condition is working and then execute the do part till the while condition is true
    In an example of data taking out of server we till to take the data do the action while we are
    connected to the server and then execute whats needed*/
    x1 = 100
    do{
        println("$x1")
        x1++
    }while (x1 <=120)
    println("Do while loop is done")

    /* For loops ----- it says for a given condition till the no. are in range u print the
    number itself ------
    A for-loop is used to iterate through ranges, arrays, collections, or anything
    that provides an iterator*/
    for (num in 1..10){
        print("$num ")
    }

    for (i in 1 until 20){
        print("\n$i ")
        if (i/2 == 5){
            // break function is used to jump out of the loop if a certain condition is meet
            // for a condition u don't have control on
            break
        }
    }
    print("Done with the loop")

    for (i in 1 until 20){
        if (i/2 == 5){
            // continue function does that when the condition is meet u skip the iteration and
            //then again run the code after that ,when the condition again meets it skips it again
            continue
        }
        print("\n$i ")
    }
    print("Done with the loop")

}
