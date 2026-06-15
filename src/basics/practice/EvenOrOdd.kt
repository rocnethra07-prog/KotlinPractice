package basics.practice

import basics.concept.doubleVar
import kotlin.math.round

//Method 1 : not null safe

//fun evenOrOdd(number: Int): Boolean {
//    return number % 2 == 0
//}
//
//fun main(){
//
//    while(true) {
//        print("Enter a number: ")
//        val num: Int = readln().toInt()
//
//
//        when (evenOrOdd(num)) {
//            true -> println("The number is even")
//            false -> println("The number is odd")
//        }
//    }
//
//}



//Method 2 : null safe and default value if null - Elvis operator
//fun evenOrOdd(number: Int): Boolean {
//    return number % 2 == 0
//}
//
//
//fun main(){
//
//    while(true) {
//        print("Enter a number: ")
//        val num: Int = readln().toIntOrNull() ?: 0
//
//
//        when (evenOrOdd(num)) {
//            true -> println("The number is even")
//            false -> println("The number is odd")
//        }
//    }
//
//}

//toInt       -> Int if success & Exception if failure
//ToIntOrNull -> Int if success & null if failure




//Method 3 : null safe with Safe Call Operator ?.
fun evenOrOdd(num: Int?) : Boolean{
    return num?.rem(2) == 0
 }


fun main() {
        print("Enter a number: ")
        val num: Int? = readln().toIntOrNull()

        val output = when (evenOrOdd(num)) {
            true -> "The number $num is even"
            false -> "The number $num is odd"
        }
        println(output)
}


