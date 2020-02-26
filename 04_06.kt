fun main(args: Array<String>) {
  var number = 6.0
  
  
  while(number >= 2) {
    if (number == 2.0)
      break
        
    number /= 2
  }

  val isPowerOfTwo = if (number == 2.0) true else false
  println(isPowerOfTwo)
}
