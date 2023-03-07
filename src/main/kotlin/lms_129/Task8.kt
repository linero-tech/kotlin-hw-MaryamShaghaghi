package lms_129

fun task8(number: Int): Int {
	var result = 0
	number.toString().forEach { digit ->
		result += digit.toString().toInt()
	}

	return result
}

fun main() {
	println(task8(123))
}