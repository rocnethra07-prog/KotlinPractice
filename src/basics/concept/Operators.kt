package basics.concept

fun main(){

//    arithmeticOperatorsDemo()

//    relationalOperatorsDemo()

//    relationalOperatorsDemoOnNumbers(1, 2L)
//    relationalOperatorsDemoOnNumbers(12.9, 6.2)
//    relationalOperatorsDemoOnNumbers(12,12.0)

//    assignmentOperatorsDemo()

    val a = "Alex"
    val b = a

    equalityOperatorsDemo("Hello", "Hello")
    equalityOperatorsDemo(a, b)


}

fun equalityOperatorsDemo(obj1 : Any? , obj2 : Any?) : Unit{
    println(obj1 == obj2)           //content check
    println(obj1 === obj2)          //reference check
    println(obj1?.equals(obj2))     //same as ==
}

fun assignmentOperatorsDemo(){
    var a = 10.0
    var b = 5
    a+=b
    println(a)
    a-=b
    println(a)
    a*=b
    println(a)
    a/=b
    println(a)
    a%=b
    println(a)

}


fun relationalOperatorsDemo(){
    val char1 = 'a'
    val char2 = 'x'

    println("$char1 > $char2 = ${char1 > char2}")
    println("$char1 < $char2 = ${char1 < char2}")
    println("$char1 >= $char2 = ${char1 >= char2}")
    println("$char1 <= $char2 = ${char1 <= char2}")
    println("$char1 == $char2 = ${char1 == char2}")
    println("$char1 != $char2 = ${char1 != char2}")


}

fun relationalOperatorsDemoOnNumbers(operand1 : Number , operand2 : Number){  //takes in any Number (Int, Short, Float, Double, Long)
    val num1 = operand1.toDouble()                 //Converted to Double
    val num2 = operand2.toDouble()

    println("$num1 > $num2 = ${num1 > num2}")
    println("$num1 < $num2 = ${num1 < num2}")
    println("$num1 >= $num2 = ${num1 >= num2}")
    println("$num1 <= $num2 = ${num1 <= num2}")
    println("$num1 == $num2 = ${num1 == num2}")
    println("$num1 != $num2 = ${num1 != num2}")
}


fun arithmeticOperatorsDemo(){
    //1 Arithmetic Operators  (same as java)

    //Integers
    var int1 = 10
    var int2 = 3

    println("int1 = " + int1 + " ; int2 = " + int2)

    println(int1 + int2)
    println(int1 - int2)
    println(int1 * int2)
    println(int1 / int2)
    println(int1 % int2)

    println()
    //As double
    var double1 = 0.1
    var double2 = 0.2

    println("double1 = " + double1 +  "; double2 = " + double2)

    println(double1 + double2)
    println(double1 - double2)
    println(double1 * double2)
    println(double1 / double2)
    println(double1 % double2)

    println(double1 + double2 == 0.3)
    println()
    //As float
    var float1 = 0.1f
    var float2 = 0.2f

    println("float1 = " + float1 + "; float2 = " + float2)

    println(float1 + float2)
    println(float1 - float2)
    println(float1 * float2)
    println(float1 / float2)
    println(float1 % float2)


    println(float1 + float2 == 0.3f)

    //2 Unary - Increment Decrement Operators
    //post increment
    println(double1++)
    println(double1)

    //pre increment
    println(double2)
    println(++double2)
    println(double2)

    //post decrement
    println(int1--)
    println(int1)

    //pre decrement
    println(--int2)
}