package basic
// Functions

fun hello(){
    println("Hello World")
}

//fun sum(x: Int, y: Int) : Int {
//    return x + y
//}

fun sum(a: Int, b: Int) = a + b
fun multiply(a: Int, b: Int) = a * b
fun subtract(a: Int, b: Int) = a - b
fun divide(a: Int, b: Int) = a / b

// Functions as Parameters
fun calculate(a: Int, b: Int, operation : (Int, Int) -> Int) = operation(a, b)

// Lambda Expression
val sumLambda = { a: Int, b: Int -> a + b }


fun main() {
//    hello()
//    println(sum(1, 2))
//    println(calculate(4, 2, ::sum))             // 4 + 2 = 6
//    println(calculate(4, 2, ::multiply))        // 4 * 2 = 8
//    println(calculate(4, 2, ::subtract))        // 4 - 2 = 2
//    println(calculate(4, 2, ::divide))          // 4 / 2 = 2

//    println(sumLambda(4, 2))                      // 4 + 2 = 6

    // Other Lambda Expression
    val upperCaseString = { text: String -> text.uppercase() }
    println(upperCaseString(upperCaseString("hello")))      // HELLO

    // Practice Use For Lambda Expression
    val numbers = listOf(1, 2, -3, 4, -5, 6, 7, 8, -9, 10)
    val positives = numbers.filter { x -> x > 0 }
    println(positives)

    val isNegative = { x: Int -> x < 0 }
    val negatives = numbers.filter(isNegative)
    println(negatives)

}