fun main(args: Array<String>) {

    val appRatings =  mapOf (
        "Calendar Pro" to arrayOf(5,1,4,3,2,5,4,3),
        "The Messenger" to arrayOf(3,2,4,3,5,2,1,4),
        "Socialize" to arrayOf(2,1,1,2,1,2,4,2)
    )
    
    var averageRatings = mutableMapOf<String,Double>()
    
    appRatings.forEach {
        val average = it.value.reduce(Int::plus).toDouble() / 8
        averageRatings[it.key] = average
    }
    
    println(averageRatings.filter {
        it.value > 3
    }.map {it.key})
}

