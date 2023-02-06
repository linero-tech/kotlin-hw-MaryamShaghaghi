package lms_129

fun task9(temperature: String): String
{
    val tempString = temperature.dropLast(1)
    val temp = tempString.toInt()
    val unit = temperature.last()

    return if (unit == 'f' || unit == 'F')
    {
        val otherUnit = (temp - 32) * 0.5556
        val final = otherUnit.toInt()
        "$final C"
    } else {
        val otherUnit = 1.8 * temp + 32
        val final = otherUnit.toInt()
        "$final F"
    }

}
fun main ()
{
    val answer = task9("-22F")
    println(answer)
}
