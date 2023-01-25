package lms_127

fun task9(sentence: String, character: Char): Boolean {
    val result = sentence.contains(character)
    return result
}
fun main() {
    val answer = task9("I code In KOTLIN", 'i')
    println(answer)
}