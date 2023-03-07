package lms_129

fun task1(a: Int, b: Int): Int {
	var result = 0
	if (a < b) {
		for (i in a..b) {
			result += i
		}
	}
	return result
}

fun main() {
	println(task1(1, 5))
}