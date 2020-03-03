fun main() {
    val numList = listOf(6,4,2,4,1,5,7)
    val newNumList = removeAll(4,numList) // [6,2,1,5,7]
    println(newNumList)
}

fun removeAll(num: Int, list: List<Int>): List<Int> {
    val numbers = list.toMutableList()
    if (num !in numbers)
    	println("$num not in list")
    else
    	while (num in numbers)
        	numbers.remove(num)
    return numbers
}
