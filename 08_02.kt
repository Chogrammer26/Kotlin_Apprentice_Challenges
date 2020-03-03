fun main() {
    var numList: List<Int> = listOf(5,6,5)
    numList = removeOne(5,numList) // [6,5]
    numList = removeOne(5,numList) // [6] 
    println(numList)
}

fun removeOne(num: Int, list: List<Int>): List<Int> {
    val numbers = list.toMutableList()
    if (num !in list)
    	println("$num not found")
    else
    	numbers.remove(num)
    return numbers
}
