fun main() {
    println(mathSum(10) {it * it})
    //println(mathSum(10) {
    //    
    //})
}

fun mathSum(length: Int, series: (Int) -> Int): Int {
    var sum = 0
    
    for (i in 1..length)
    	sum += series(i)
    
    return sum
}
