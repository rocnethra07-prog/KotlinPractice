package basics

//Input/Output
//Control Flow

fun main(){
    println("Enter name:")
    val name = readln()

    print("Enter age:")
    val age = readln().toIntOrNull()

    println("$name is $age years old")
}