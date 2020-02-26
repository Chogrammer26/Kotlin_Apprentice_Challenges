// finding the factorial of a number 
fun main(args: Array<String>) {
    var num: Int = 5
    var result: Int = 1
    
    while (num >= 2) 
    	result *= num-- 
    
    println(result)
}
