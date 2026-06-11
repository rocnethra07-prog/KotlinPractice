package basics


/*
* The Main method is the entry point.
* In java, we write it inside a class public static void main(String[] args)
* In kotlin, simply fun main() with no arguments or (args: Array<String>)
* */

fun main(args: Array<String>) {
    println("Hello")
}

fun main(){
    println("HI")
}

class User(userName: String){

    var name = userName

    fun greet(){
        Main(name)
        println("hi " + name)
    }

}

/*
Internally, the kotlin compiler will change it to:
public final class MainClassKt {
    public static void main() {
        System.out.println("Hello");
    }
}

JVM run MainClassKt.main()

The JVM still needs classes
The JVM only understands class files.
So Kotlin creates them behind the scenes.
*/
