import java.util.Arrays

fun main() {
    val numArray = arrayOf(1,3,4,5)
    val reversedNum: Array<Int> = reverse(numArray)
    println(Arrays.toString(reversedNum))
}

fun reverse(array: Array<Int>): Array<Int> {
    var numbers: Array<Int> = arrayOf()
    for (i in array.size - 1 downTo 0)
    	numbers += array[i]
    return numbers
}
