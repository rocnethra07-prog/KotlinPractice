package basics.practice

fun main(){

    print("Enter name: ")
    val name = readln().trim()
    var score: Int?
    do {
        print("\nEnter average score (0-100): ")
        score = readln().toIntOrNull()
        if(score == null){
            println("Enter a valid number between 0 to 100")
            continue
        }

        if(score < 0 || score > 100){
            println("Average score should be within 0 to 100")
            continue
        }
        break

    }while (true)

    try {
        val grade = getGrade(score)
        print("$name has scored $grade Grade")
    }
    catch (e: IllegalArgumentException){
        print(e.message)
    }
}

fun getGrade(score: Int) : Char{

    if(score !in 0..100){
        throw IllegalArgumentException("Invalid score. Average score should be within 0 to 100 ")
    }

    return when(score){
        in 90 .. 100 -> 'A'
        in 80 .. 89 -> 'B'
        in 70 .. 79 -> 'C'
        in 50 .. 69 -> 'D'
        else -> 'F'
    }
}