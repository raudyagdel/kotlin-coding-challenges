package basic
import kotlin.random.Random

fun main() {

    // Conditional Expression //
    // If Else
    val check = false
//    val d : Int
//    if (check) {
//       d = 1
//    } else {
//       d =  2
//    }
//    val d = if (check) 1 else 2  // Better Solution - Similar to Ternary Operator In Python, C++ And Others Programming Languages
//    println(d)   // Print 2
//
//    val a = 99
//    val b = 45
//    val c = if (a > b) a else b  // Get Max
//    val m = if (a < b) a else b  // Get Min
//    println(c) // Print 99
//    println(m) // Print 45

    // When
    val obj = "Hello World"
//    when (obj) {
//        // Check whether obj equals to "1"
//        "1" -> println("One")
//        // Check whether obj equals to "Hello World"
//        "Hello World" -> println("Greeting")
//        // Default statement
//        else -> println("Unknown")
//    }
    // Greeting
//   val result = when (obj) {
//        "1" -> "One"
//        "Hello World" -> "Greeting"
//        else -> "Unknown"
//    }
//    println(result) // Greeting

//    val result = when {
//        obj == "Hello World" -> "Greeting"
//        obj == "1" -> "One"
//        else -> "Unknown"
//    }
//    println(result) // Greeting


    //  Exercises //
    //  Exercise 1
//    Create a simple game where you win if throwing two dice results in the same number.
//    Use if to print You win :) if the dice match or You lose :( otherwise.
//    val firstResult = Random.nextInt(6)
//    val secondResult = Random.nextInt(6)
//    println(if (firstResult == secondResult) "You win :)" else "You lose :(")

    //  Exercise 2
//    Using a when expression, update the following program so that it prints the corresponding actions
//    when you input the names of game console buttons.
//      Button      Action
//      A           Yes
//      B           No
//      X           Menu
//      Y           Nothing
//      Other       There is no such button

//    val button = "P"
//
//    println(
//        when (button) {
//            "A" -> "Yes"
//            "B" -> "No"
//            "X" -> "Menu"
//            "Y" -> "Nothing"
//            else -> "There is no such button"
//        }
//    )


    // Ranges //

    // For Loops
    // Iterate Over a Range
//    for (i in 1..10) {
//        println(i)
//    }

    // Iterate Over a List
//    val fruits = listOf("Apple", "Pear", "Grape")
//    for (fruit in fruits) {
//        println(fruit)
//    }

    // Iterate Over a Range - Change Range Expression
//    for (i in 2..10 step 2) {
//        println(i)              // 2 4 6 8 10
//    }
//
//    for (i in 1 until 10) {
//        println(i)              // 1 2 3 4 5 6 7 8 9
//    }

//    for (i in 10 downTo 0) {
//        println(i)                // 10 9 8 7 6 5 4 3 2 1 0
//    }

    // While - Do While

    // PreCondition
//    var cakesEaten = 0
//    var cakesBaked = 0
//    while(cakesEaten < 5){
//        println("Eat a Cake")
//        cakesEaten++
//    }
//    // PostCondition
//
//    do {
//        println("Bake a Cake")
//        cakesBaked++
//    }while(cakesBaked < cakesEaten)

    // Exercises

    // Exercise 1
    //You have a list of words. Use for and if to print only the words that start with the letter l.
    val words = listOf("dinosaur", "limousine", "magazine", "language")
//    for (word in words) {
//        if (word.first() == 'l') {
//            println(word)
//        }
//    }

    // Other Valid Solution - Using String Function
//    for (word in words) {
//        if (word.startsWith("l")) {
//            println(word)
//        }
//    }

    // Other Valid Solution - Using While Loop
//    val wordsIterator = words.iterator()
//    while(wordsIterator.hasNext()) {
//        val word = wordsIterator.next()
//        if(word.startsWith("l")) {
//            println(word)
//        }
//    }
}
