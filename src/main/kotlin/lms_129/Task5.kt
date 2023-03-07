package lms_129

fun task5(sentence: String): Int {
	var result = 0

	for (i in sentence.indices) {
		result += 1
	}
	return result
}

fun main() {
	println(task5("I LOVE GBG"))
}