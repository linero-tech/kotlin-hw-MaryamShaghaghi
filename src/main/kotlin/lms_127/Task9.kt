package lms_127

fun task9(sentence: String, character: Char): Boolean {
	return sentence.contains(character, ignoreCase = true)
}

fun main() {
	println(task9("I code In KOTLIN", 'i'))
}