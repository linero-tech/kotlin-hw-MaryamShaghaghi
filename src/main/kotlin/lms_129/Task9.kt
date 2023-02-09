package lms_129

fun task9(temperature: String): String
{
    val temp = temperature.dropLast(1).toInt()
    val unit = temperature.last()

    return if (unit == 'f' || unit == 'F')
    {
        val convert = (temp - 32) * 0.5556
        val convert2 = convert.toInt()
        val result = "$convert2 C".replace("\\s".toRegex(),"")
        result

    } else {
        val convert = 1.8 * temp + 32
        val convert2 = convert.toInt()
        val result = "$convert2 F".replace("\\s".toRegex(),"")
        result
    }

}
fun main ()
{
    val answer = task9("50f")
    println(answer)
}
