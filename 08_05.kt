import java.util.Arrays

fun main() {
    val numArray = arrayOf(1,3,4,5)
    val reversedNum: Array<Int> = reverse(numArray)
    println(Arrays.toString(reversedNum))
}

fun reverse(array: Array<Int>): Array<Int> {
    var numbers = Array(array.size,{0})
    for (i in 0 until array.size)
    	numbers[i] = array[array.size - i - 1]
    return numbers
}
