package lms_127

fun task8(sentence: String, character: Char): Int
{
    return sentence.count { it == character }
}
fun main() {
    val answer = task8("I code in KOTLIN",'I' )
    println(answer)
}
