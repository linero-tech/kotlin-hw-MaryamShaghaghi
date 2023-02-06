package lms_129

fun task2(number: Int): Boolean
{
    if (number == 0 || number == 1)
    {
        return false
    }
    else
    {
        var result = true
        for (i in 2..number / 2)
        {
            if (number % i == 0)
            {
                result = false
                break
            }
        }
        return result
    }

}
fun main() {
    val answer = task2(5)
    println(answer)
}