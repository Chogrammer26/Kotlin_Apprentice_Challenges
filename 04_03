fun main(args: Array<String>) {
  var pos: Int = 0 
  var xyPOS = Pair(pos / 8, pos % 8)
  println("Currrent Position: $pos - R${xyPOS.first}C${xyPOS.second}")
  
  xyPOS = Pair(if (xyPOS.second == 7) 0 else xyPOS.first, if (xyPOS.second == 7) 0 else xyPOS.second + 1)
  pos = if (pos == 63) 0 else pos + 1 
  println("Next Position: $pos - R${xyPOS.first}C${xyPOS.second}")
  
  
}
