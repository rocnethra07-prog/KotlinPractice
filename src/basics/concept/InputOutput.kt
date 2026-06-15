package basics.concept
import java.util.Scanner
import kotlin.math.sin
import kotlin.math.sinh

//Input/Output


//5. Java Import
fun main() {

    val scanner = Scanner(System.`in`)

    val age = scanner.next()

    println(age)
}


//fun main(){
//    println("Enter name:")
//    val name = readln()
//
//    print("Enter age:")
//    val age = readln().toIntOrNull()
//
//    println("$name is $age years old")
//
//}



//1. Basic
fun basicInput(){
    val str:String = readln()
//    returns String
//    returns "" when user enters an empty line, readLine()!! internally

    val str2:String? = readLine()
//    returns String?
//    returns null when user enters an empty line

}


//2. Type Conversion
fun inputTypeConversion(){
    val integerInput: Int = readln().toInt()
    val floatInput: Float = readln().toFloat()
    val doubleInput: Double = readln().toDouble()
    val shortInput: Short = readln().toShort()
    val booleanInput:Boolean = readln().toBoolean()
    //exception on invalid input
}


//3. Safe Conversion
/*
readln().toIntOrNull()
readln().toDoubleOrNull()
readln().toFloatOrNull()
*/


//4. Reading multiple values
//fun main() {
//    val inputs = readln().split(",")  //List<String>
//
//    for(input in inputs){
//        println(input.trim())
//    }
//}


