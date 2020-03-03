fun main() {
    val numList: List<Int> = listOf(5,6,5)
    removeOne(5,numList) // [6,5]
    removeOne(5,numList) // [6]      
}

fun removeOne(num: Int, list: List<Int>): List<Int> {
    val numbers = list.toMutableList()
    if (num !in list)
    	println("$num not found")
    else
    	list.remove(num)
    return numbers
}
