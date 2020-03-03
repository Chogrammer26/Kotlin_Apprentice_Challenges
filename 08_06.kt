fun main() {
    val numArray: Array<Int> = arrayOf()
    println(minMax(numArray))
      
}

fun minMax(array: Array<Int>): Pair<Int,Int>? {
    if (array.isEmpty())
    	return null
    
    var min = array[0]
    var max = array[0]
    
    for (i in 1..array.size - 1) {
    	if (array[i] < min)
        	min = array[i]
        if (array[i] > max)
        	max = array[i]
    }
    
    return Pair(min,max)   	
}
