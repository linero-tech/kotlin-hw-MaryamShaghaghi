package lms_129

fun task3(number: Int): Int
{
    var result = 1
          for (i in 1..number)
    {
        result *= i
    }

    return result
}
fun main()
{
    val answer = task3(5)
    println(answer)
}