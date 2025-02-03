package basic


class Hello(){
    fun print() = println("Hello")
}

// Constructor
//class Person(name: String){
//
//    val firstProperty = "First property: $name".also(::println)
//
//    init {
//        println("First initializer block that prints $name")
//    }
//}

//class Person(val firstName: String,val lastName: String, var age: Int, var isEmployed : Boolean = true){
//
//}


// Secondary Contructors
//class Pet(val name: String) {
//    constructor(name: String , owner : Person) : this(name) {
//        owner.pets.add(this)
//    }
//}
//class Person(val pets: MutableList<Pet> = mutableListOf())

// Other Example Using Secondary Contructors
//class Person(val name: String){
//    val children : MutableList<Person> = mutableListOf()
//    constructor(name: String, parent: Person): this(name){
//        parent.children.add(this)
//    }
//}

// Inheritance

open class Polygon {
    open fun draw() {
        // Draw Polygon
    }
}

class Rectangle(val width: Int, val height: Int) : Polygon() {
    override fun draw() {
        // Draw Rectangle
        // Calling SuperClass Implementation
        super.draw()    // Class Polygon::draw()
    }

    val area get() = this.width * this.height
    var perimeter: Int
        get() = this.width * 2 + this.height * 2
        set(value) {
            println("Setted Value $value")  // Do Nothing
        }
}

class Triangle : Polygon() {
//    override fun draw() {
//        // Draw Triangle
//    }
}

// If You Can Override a Non-Abstract Member Use OPEN

// All Class In Kotlin Have A Common SuperClass, Named "Any"
// Any Has Tree Methods, equals(), hashCode(), and toString()

class Example
// Argument In Constructor Base
open class Base(id : String) // Open For Inheritance
// Argument In Constructor Derived
class Derived(id: String) : Base(id) {

}

class Derived2 : Base {
    constructor(id: String) : super(id){

    }

    constructor(id: String, name: String) : super(id){

    }
}

// Getter y Setter

fun main() {
//    val person = Person("Melane", "Trump", 36)
//
//    println(person.firstName)
//    println(person.lastName)
//    println(person.age)
//
//    // Happy BirthDay
//    person.age++
//    println(person.age)
//
//    // Default Property Values
//
//    print("${person.firstName} ${person.lastName} ${if(person.isEmployed) "Is Employed" else "Not Is Employed"}")
//
//    val person = Person()
//    val petOne = Pet("Lux", person)
//    val petTwo = Pet("Matt", person)
//    for(p in person.pets){
//        println(p.name)
//    }
//    person.pets.map { p -> p.name }.forEach(::println)

//    val parent = Person("John")
//    val child1 = Person("Ana", parent)
//    val child2 = Person("Pep", parent)
//    for(c in parent.children){
//        println(c.name)
//    }

//    val d = Derived("1")
//    val dd = Derived2("2")
//    val dd2 = Derived2("3", "Derived 2")

    val rectangle = Rectangle(10, 5)
    val rectangleArea = rectangle.area
    println(rectangleArea) // 50

    val rectanglePerimeter = rectangle.perimeter
    println(rectanglePerimeter)     // 30

    // That Not Sense, Only Is For Example Purpose
    rectangle.perimeter = 40
    println(rectangle.perimeter)

}