package lms_127

fun task8(sentence: String, character: Char): Int {
    val result = sentence.count {it == character }
    return result
}
fun main() {
    val answer = task8("I code in KOTLIN",'I' )
    println(answer)
}
