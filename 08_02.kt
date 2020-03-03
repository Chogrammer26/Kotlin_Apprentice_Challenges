fun main() {
    var numList = mutableListOf(5,6,5)
    removeOne(5,numList) // [6,5]
    removeOne(5,numList) // [6]      
}

fun removeOne(num: Int, list: MutableList<Int>): Unit {
    if (num !in list)
    	println("$num not found")
    else
    	list.remove(num)   
}
