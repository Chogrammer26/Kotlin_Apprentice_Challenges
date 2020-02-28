fun main(args: Array<String>) {
    print(isPrime(4))
}

fun isPrime(num: Int): Boolean {
    if (num < 0)
    	return false
    else {
    	for (i in 2..num / 2) 
    		if (num % i == 0)
        		return false
    	return true
    }
}
