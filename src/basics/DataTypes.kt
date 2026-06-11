package basics

/*
In kotlin variables are either var or val
val = read only reference
var = mutable reference
*/


val immutable = "I can't be re-assigned"
//final String immutable

var mutable = "I can be re-assigned"
//String mutable
//Compiler figures out types automatically.

fun main() {
    println(immutable)
    println(mutable)
    mutable = "Re-assigned"
    println("My String ${mutable}")

    var b1: Byte = Byte.MIN_VALUE
    var b2: Byte = Byte.MAX_VALUE
    println("Smallest byte value: " +b1)
    println("Largest byte value: " +b2)

    var s1: Short = Short.MIN_VALUE
    var s2: Short = Short.MAX_VALUE
    println("Smallest short value: " +s1)
    println("Largest short value: " +s2)

    var i1: Int = Int.MIN_VALUE
    var i2: Int = Int.MAX_VALUE
    println("Smallest integer value: " +i1)
    println("Largest integer value: " +i2)

    var l1: Long = Long.MIN_VALUE
    var l2: Long = Long.MAX_VALUE
    println("Smallest long value: " +l1)
    println("Largest long value: " +l2)

    var F1: Float = Float.MIN_VALUE
    var F2: Float = Float.MAX_VALUE
    println("Smallest Float value: " +F1)
    println("Largest Float value: " + F2)

    var D1: Double = Double.MIN_VALUE
    var D2: Double = Double.MAX_VALUE
    println("Smallest Double value: " + D1)
    println("Largest Double value: " + D2)

}

//Type Inference
//Kotlin simply saves you from writing obvious types

val str = "String"     //:String
var integer = 12       //:Int
var longVar = 1232L    //:Long
var floatVar = 12.02f  //:Float
var doubleVar = 12.32  //:Double
var character = 'a'    //:Char
var boolVar = true     //:Boolean


var userObj = User("Kavya")  //:User

var names = listOf("Alice", "Bob", "Charlie") //:List<String>
//Compiler looks at the arguments "Alice", "Bob", "Charlie" and infers it is a List of String


//Type Inference won't work

//val emptyList = listOf()
//val emptyMap = mapOf()
//val name
//val x = x

fun typeInferenceTest(){

//  val name  -  not allowed compiler cannot decide what type it is

    val name: String
    name = "12"

    val nullVar = null   //:Nothing?

}


//Access Modifiers
/*
public
private
protected
internal

public variables by default
private accessible only inside that block
protected accessible only inside and its child classes
internal accessible anywhere inside the same module (not package).

*/

//DataTypes

val age: Byte = 18      //1 byte
val year: Short = 2026   //2 byte
val salary: Int = 50_000      //4 byte
val phone: Long = 9898121283L //8 byte


val price: Float = 10.50f   //4 bytes
val average: Double = 10.00986 //8 bytes

val isDigit:Boolean = true   //1 byte

val grade: Char = 'A'          //2 bytes
val name:String = "Nethra"     //

val random: Any = "Anything" //Equivalent to Object in Java

fun doNothing() : Unit {
    //Unit = void
}

var nullable: String? = null //this means String or null

val validAge: Int = 12
//compiled to int

val invalidAge: Int? = null
//compiled to Integer

//the Kotlin compiler uses Java primitives whenever possible for performance, and wrapper classes only when necessary
