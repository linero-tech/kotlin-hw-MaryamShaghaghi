package lms_129

fun task2(number: Int): Boolean {
    var primeNumber = true
    for (i in 2..number / 2) {
    if (number % i == 0){
    primeNumber = false
    break
    }
    }
    return primeNumber
}
fun main() {
    val answer = task2(11)
    println(answer)
}