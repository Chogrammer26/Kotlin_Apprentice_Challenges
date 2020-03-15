fun main() {
    println(mathSum(10) {it * it})
    println(mathSum(10) { i ->
      var counter = 0
      var a = 1
      var b = 1 
      var sum: Int
      while (counter++ < i - 2) {
          sum = a + b
          a = b 
          b = sum 
      }
      b
    })
}

fun mathSum(length: Int, series: (Int) -> Int): Int {
    var sum = 0
    
    for (i in 1..length)
    	sum += series(i)
    
    return sum
}
