fun main(args: Array<String>): Unit {
    var firstDie = 1
    var secondDie = 1
    val numRoll:Int = 2
    var odds:Int = 0 
    
    while (firstDie <= 6) {
        while (secondDie <=6) {
            if (firstDie + secondDie == numRoll) 
            	odds++
            secondDie++
        }
        
        secondDie = 1
        firstDie++
    }
    
    println(odds)
}
