fun main(args: Array<String>) {
    
    repeatTask(10) {
        println("Kotlin Apprentice is a good book!")
    }
}

fun repeatTask(times: Int, task: () -> Unit) {
    for (i in 0 until times)
    	task()
}
