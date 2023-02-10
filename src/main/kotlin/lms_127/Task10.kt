package lms_127

fun task101(assessments: String): Int
{
    return assessments.length
}
/*fun main() {
 val answer = task10_1("LMHHF")
 println(answer)
}
*/

fun task102(assessments: String): Char
{
    return assessments[3]
}
/* fun main() {
    val answer = task10_2("LMFHMF")
    println(answer)
}
*/

fun task103(assessments: String): Char
{
    return assessments.get(assessments.length / 2)
}

/*fun main() {
  val answer = task10_3("LMFHM")
    println(answer)
}
*/

fun task104(assessments: String): String
{
    return assessments.substring(0, 3)
}


fun main() {

    val answer = task104("LMFHM")
    println(answer)
}
