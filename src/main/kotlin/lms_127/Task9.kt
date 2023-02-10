package lms_127

fun task9(sentence: String, character: Char): Boolean
{
    return sentence.contains(character, ignoreCase = true)
}
fun main() {
    val answer = task9("I code In KOTLIN", 'i')
    println(answer)
}