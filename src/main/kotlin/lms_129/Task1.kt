package lms_129

fun task1(a: Int, b: Int): Int
{
    var result = 0
    for (i in a..b)
    {
        result += i
    }
    return result
}
fun main() {
    val answer = task1(1,5)
    println(answer)
}