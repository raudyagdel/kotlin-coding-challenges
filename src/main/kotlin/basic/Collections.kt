package basic

fun main() {
    // Lists
    // Read Only List
//    val readOnlyList = listOf(1, 2, 3, 4, 5)

    // Mutable List
//    val mutableList = mutableListOf(1, 2, 3, 4, 5)
//    mutableList.add(6)

    // Read Only View or Copy From Mutable List
//    val numbers = mutableList
//    numbers.add(7)

    // Access To Items In A List
//    println("the first item is ${numbers[0]}")                  // Using Indexed Access Operator
//    println("the first item is ${numbers.first()}")             // Using First Function
//    println("the last item is ${numbers.last()}")               // Using Last Function
//    println("the last item is ${numbers[numbers.count() - 1]}") // Using Indexed Access Operator
//
//    // Numbers Of Items
//    println("the list has ${numbers.count()} items")

    // Check An Items Is In a List
//    println(99 in numbers) // Return False
//    println(5 in numbers)  // Return True

    // Update Items In a List
//    numbers.add(8)                          // Add 8 At End  [1,2,3,4,5,6,7,8]
//    numbers.addFirst(0)                 // Add 0 At Begin [0,1,2,3,4,5,6,7,8]
//    numbers.add(5, 6)       // Add 6 In 5 Index [0,1,2,3,4,6,5,6,7,8]

//    numbers.remove(6)                 // Remove Element 6 If Is Present [0,1,2,3,4,5,6,7,8]
//    numbers.remove(99)                // Do Nothing
//    numbers.removeAll { it == 6 }        // Remove All Occurrences Of Element 6
//    numbers.removeFirst()               // Remove First Element
//    numbers.removeLast()                // Remove Last Element

    // Sets
//    val readOnlyFruits = setOf("Apple", "Banana", "Pear", "Grape")
//    println(readOnlyFruits)
//
//    val mutableFruits = mutableSetOf("Apple", "Banana", "Pear", "Grape")
//    println(mutableFruits)
//
//    // Count
//    println("this set has ${readOnlyFruits.count()} fruits")
//
//    // Check
//    println("Banana" in readOnlyFruits)     // True
//    println("Orange" in readOnlyFruits)     // False
//
//    // Add or Remove
//    val fruits = mutableFruits
//    fruits.add("Orange")
//    println(fruits)


    // Maps - [Key = Value]
//    val readOnlyJuiceMenu =  mapOf("apple" to 100, "banana" to 190, "grape" to 300, "orange" to 400, "pear" to 500)
//    println(readOnlyJuiceMenu)
//
//    val mutableJuiceMenu =  mutableMapOf("apple" to 100, "banana" to 190, "grape" to 300, "orange" to 400, "pear" to 500)
//    println(mutableJuiceMenu)
//
//    // Access To Item On Map
//    println("the value of apple juice is: ${readOnlyJuiceMenu["apple"]}")           // Using Indexed Access Operator
//    println("the value of pineapple juice is: ${readOnlyJuiceMenu["pineapple"]}")   // Return Null Value
//
//    // Add Items
//    val juiceMenu = mutableJuiceMenu
//    juiceMenu["pineapple"] = 250        // Using Indexed Access Operator
//    println(juiceMenu)
//
//    // Update Items
//    juiceMenu["banana"] = 150           // Using Indexed Access Operator
//    println(juiceMenu)
//
//    // Remove Items
//    juiceMenu.remove("pineapple")
//    juiceMenu.remove("apple")
//    println(juiceMenu)
//
//    // Count Same As List or Set
//    println(juiceMenu.count())          // 4 Items
//
//    // Check If Key is Already Included
//    println(juiceMenu.containsKey("pineapple"))          // False
//    println(juiceMenu.containsKey("banana"))             // True
//
//    // Get Keys And Values
//    val keys = juiceMenu.keys
//    println(keys)
//
//    val values = juiceMenu.values
//    println(values)

//    Exercise 1
//    You have a list of “green” numbers and a list of “red” numbers.
//    Complete the code to print how many numbers there are in total.

//    val greenNumbers = listOf(1, 4, 23)
//    val redNumbers = listOf(17, 2)
//    val total = greenNumbers.count() + redNumbers.count()
//    println(total) // 5


//    Exercise 2
//    You have a set of protocols supported by your server.
//    A user requests to use a particular protocol.
//    Complete the program to check whether the requested protocol
//    is supported or not (isSupported must be a Boolean value).

//    val supported = setOf("HTTP", "HTTPS", "FTP")
//    val requested = "smtp"
//    val isSupported = requested.uppercase() in supported
//    println("Support for $requested: $isSupported")

//    Exercise 3
//    Define a map that relates integer numbers from 1 to 3 to their corresponding spelling.
//    Use this map to spell the given number.

    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}
