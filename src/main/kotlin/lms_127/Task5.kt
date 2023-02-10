package lms_127

fun task5(valueForA: Int, valueForB: Int): Pair<Int, Int> {
    // Do not change or delete these variables
    var a = valueForA
    var b = valueForB

    a -= b
    b += a
    a = b - a

    // Do not erase or change this statement
    return Pair(a, b)
}
fun main() {
    val answer = task5(1,2)
    println(answer)
}