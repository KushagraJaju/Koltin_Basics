package com.example.koltinbasic

fun main(){

    var result = addUp(6.0,10)
    println("Result is $result")

    //argument
    var avg = avg(4.6,13.0)
    println("Result is $avg")

    var name : String = "HELLO"
    // name = null -- Compilation Error
    // The ? allows to assign an empty value
    var nullableName : String? = "Hello"
    //nullableName = null

    var len = name.length
    var len2 = nullableName?.length
    nullableName?.let { println(it.length) }

    // ?: ---- elvis operator
    val name1 = nullableName ?: "Guest"
    println("name is $name")

    nullableName!!.toLowerCase()

    //Old Fashion way
    /*if(nullableName != null) {

        var len2 = nullableName.length
    }else{
        null
    }*/

    myFunction1(5)

}

//Method -- a Method is a function within a class
//Parameter (input)
fun addUp(a: Double, b: Int) : Double{
    /* the output ( the return keyword indicates that this function will return the
    this function is called and executed ) */
    return a+b
}

fun avg(a: Double, b: Double) : Double{
    return(a+b)/2
}

// rounded brackets are ur parameters
// Curly brackets is for the code block to be executed when the function is called
fun myFunction() {
    print("called from  myFunction")
}

// Class is a blue print of a object
// variable set in a class can be used in that class only

//this a is a parameter
fun myFunction1(a:Int){
    // a is a variable
    var b = 4
    println("a is $b")
}