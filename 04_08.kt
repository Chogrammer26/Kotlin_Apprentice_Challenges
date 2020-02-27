// finding nth term in the fibonacci sequence
fun main(args: Array<String>) {
  var a = 1
  var b = 1
  var temp = a
  var fibo:Int
  var nthTerm: Int = 6
  
  if (nthTerm == 1 || nthTerm == 2)
    fibo = 1
  else {
    while(nthTerm > 2) {
      temp = a
      a = b
      b += temp
      nthTerm--
    }
    
    fibo = b
    
  }
  
  println(fibo)
}
