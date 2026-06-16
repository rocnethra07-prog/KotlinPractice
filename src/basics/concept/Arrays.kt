package basics.concept



fun main(){
    val array: Array<Int> = arrayOf(1,2,4)
    //equivalent to Integer[]
    //fixed size

    println(array)

    println(array[0])
    array[0] = 98

    println(array.contentToString())


    val arr: IntArray = intArrayOf(1,2,3)
    val arr2 = IntArray(10)
    //equivalent to int[10]
    arr2[0] = 1
    println(arr2.contentToString())
    println(array.firstEle())

}

fun Array<Int>.firstEle(): Int {
    return this.get(0)
}