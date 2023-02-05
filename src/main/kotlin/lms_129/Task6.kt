package lms_129

fun task6(number: Int): Int
{
     var num = number
     var result = 0
     while (num != 0)
    {
        val remainder = num % 10
        result = result * 10 + remainder
        num /= 10
    }
    return result
}
fun main()
{
    val answer = task6(678)
    println(answer)
}