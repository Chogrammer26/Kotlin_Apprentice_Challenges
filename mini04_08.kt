fun main(args: Array<String>) {
    var counter: Int = 0
    var roll: Int = 0
    
    do {
        roll = Random().nextInt(6)
        counter++
        println("After $counter rolls, roll is $roll")
    } while (roll != 0)
}
