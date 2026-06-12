package basics

class Song(name: String){
    var name = name

     override fun equals(other: Any?): Boolean {

        if (other !is Song)
            return false

        return name == (other as Song).name
    }
}

fun main(){
    var song1 = Song("Naan Un")
    var song2 = song1

    var song3 = Song("Naan Un")

    checkEquality(song1, song2)
    println()
    checkEquality(song1, song3)
    println()
    println(song1.equals("S"))
}

/*
=== -> Same object?
==  -> Calls equals()
Default equals() also checks:
Same object? (===)
*/


fun checkEquality(song1:Song, song2:Song){
    println("song1 == song2      = " + (song1 == song2))
    println("song1.equals(song2) = " +song1.equals(song2))
    println("song1 === song2     = " + (song1 === song2))
}


