package basics.concept

import basics.practice.atm.User
import java.time.ZoneId

//class User{}
//var userWithNoProperties = User()

//
//class User{
//    var name: String
//    constructor(name: String){
//        this.name = name;
//    }
//}
//
//fun changeNameDemo() {
//    var userWithName = User("ALice");
//    var userName = userWithName.name
//    userName = "Bob"
//}


//Primary Constructor (concise):
//class User(private val name:String, private val age:Int)
//
//fun main(){
//    var user1 = User("Dhanya", 23)
//    var user2 = User(age = 21, name = "Kavya")
//}


//class UserWithDefaultNameAge(private val name:String = "Nethra", private val age:Int = 18 )
//class UserWithDefaultAge(private val name:String, private val age:Int = 12)
//
//fun main(){
//    val user1 = UserWithDefaultAge("Lebron")
//    val user2 = UserWithDefaultNameAge()
//    val user3 = UserWithDefaultAge("Lebron", 12)
//}

//
//class User(val name: String){
//
//    init {
//        println("Init Block")
//    }
//}
//
//fun main(){
//    val user= User("Surya")
//}
/*
1. Constructor parameters assigned
2. init block executes
3. Object ready

Runs immediately after constructor values are received.

Used for:

validation
logging
setup
 */

//
//class Student(val name:String, val mark:Int){
//    init{
//        if(mark <0){
//            throw Exception("Mark cannot be negative")
//        }
//    }
//}
//
//fun main(){
//    val s1 = Student("kavya", -12)
//    val s2 = Student("Nethra",12)
//}


//Secondary constructor
//class Employee{
//    val name:String
//    val age:Int
//
//    constructor(name:String){
//        this.name = name
//        this.age = 0
//    }
//
//    constructor(name:String,age:Int ){
//        this.name = name
//        this.age = age
//    }
//
//
//}

//Primary constructor, validation and initialize
//class Cab(
//    cabId: String,
//    registrationNumber: String,
//    model: String,
//) {
//
//    val cabId: String
//    val registrationNumber: String
//    val model: String
//
//    init {
//
//        if(cabId.isBlank()){
//            throw Exception("Cab Id cannot be blank")
//        }
//        if (registrationNumber.isBlank()) {
//            throw Exception("Registration number cannot be null or blank.")
//        }
//
//        if (model.isBlank()) {
//            throw Exception("Car model cannot be null or blank.")
//        }
//
//
//        this.registrationNumber = registrationNumber.trim().uppercase()
//
//        this.model = model.trim()
//
//        this.cabId = cabId.trim()
//    }
//}

//Secondary constructor
class Cab {

    val cabId: String
    val registrationNumber: String
    val model: String

    constructor(
        cabId: String,
        registrationNumber: String,
        model: String,
    ) {

        if(cabId.isBlank()){
            throw Exception("Cab Id cannot be blank")
        }

        if (registrationNumber.isBlank()) {
            throw Exception("Registration number cannot be blank.")
        }

        if (model.isBlank()) {
            throw Exception("Model cannot be blank.")
        }

        this.cabId = cabId.trim()

        this.registrationNumber = registrationNumber.trim().uppercase()

        this.model = model.trim()

    }
}

//Primary Constructor + init
//is the standard Kotlin style
//
//
//instead of
//val registrationNumber: String
//
//init {
//    this.registrationNumber =
//        registrationNumber.trim()
// }
//
//they write:
//
//val registrationNumber =
//    registrationNumber.trim()
//
//because Kotlin allows property initialization directly where the property is declared.
//
//Java mindset
//declare field -> constructor -> assign field
//
//Kotlin mindset
//declare field and assign immediately