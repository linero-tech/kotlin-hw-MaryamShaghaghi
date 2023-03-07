package lms_127


import java.text.DecimalFormat

fun task3(radius: Double): Double {
	val pi = 3.1416
	val perimeterOfCircle = 2 * pi * radius
	val df = DecimalFormat("#.##")
	val result = df.format(perimeterOfCircle)
	return result.toDouble()

}

fun main() {
	println(task3(2.0))
}
