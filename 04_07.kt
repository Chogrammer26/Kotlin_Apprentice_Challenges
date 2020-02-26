fun main(args: Array<String>) {
  var powersOfTwo = 1
  var counter = 0
  
  do {
  
    println("2 ^ $counter = $powersOfTwo")
    powersOfTwo *= 2
    
  } while (++counter < 10)
}
