package lms_127

fun task10_1(assessments: String): Int {
    val result = assessments.length
    return result
}
/*fun main() {
 val answer = task10_1("LMHHF")
 println(answer)
}
*/

fun task10_2(assessments: String): Char {
    val result = assessments[3]
    return result
}
/* fun main() {
    val answer = task10_2("LMFHMF")
    println(answer)
}
*/

fun task10_3(assessments: String): Char {
val result = assessments.get(assessments.length/2)
    return result
}

/*fun main() {
  val answer = task10_3("LMFHM")
    println(answer)
}
*/

fun task10_4(assessments: String): String {
    val result = assessments.substring(0,3)
    return result
}


fun main() {

    val answer = task10_4("LMFHM")
    println(answer)
}
