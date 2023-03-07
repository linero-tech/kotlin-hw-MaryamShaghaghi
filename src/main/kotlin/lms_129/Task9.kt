package lms_129

fun task9(temperature: String): String {
	val magnitude = temperature.dropLast(1).toDouble()
	val unit = temperature.last().uppercase()

	val convertedTemp = if (unit == "F") {
		((magnitude - 32) * 5 / 9).toInt()
	} else {
		(magnitude * 9 / 5 + 32).toInt()
	}
	val convertedUnit = if (unit == "C") "F" else "C"
	return "$convertedTemp$convertedUnit"
}

fun main() {
	println(task9("50f"))
}
