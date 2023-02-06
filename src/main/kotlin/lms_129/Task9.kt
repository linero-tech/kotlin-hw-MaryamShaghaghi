package lms_129

fun task9(temperature: String): String
{
    val tempString = temperature.dropLast(1)
    val temp = tempString.toInt()
    val unit = temperature.last()

    return if (unit == 'f' || unit == 'F')
    {
        val convert = (temp - 32) * 0.5556
        val convert2 = convert.toInt()
        val convert3 = "$convert2 C"
        val result = convert3.replace("\\s".toRegex(),"")
        result

    } else {
        val convert = 1.8 * temp + 32
        val convert2 = convert.toInt()
        val convert3 = "$convert2 F"
        val result = convert3.replace("\\s".toRegex(),"")
        result
    }

}
fun main ()
{
    val answer = task9("50f")
    println(answer)
}
