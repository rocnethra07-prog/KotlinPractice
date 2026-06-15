package basics.practice

val RED = "\u001B[31m"
val GREEN = "\u001B[32m"

fun main(){

    var number: Int

    while(true){
        number = readln().toIntOrNull() ?: continue
        break
    }

    val result = number.checkIfPrime()
    if(result){
        println(GREEN + "Given number $number is Prime")
    }
    else{
        println(RED + "Given number $number is not Prime")
    }
}

fun Int.checkIfPrime(): Boolean{
    println(this)

    if(this <= 1) return false

    for(i in 2 until this){
        if(this % i == 0){
            return false
        }
    }
    return true
}


