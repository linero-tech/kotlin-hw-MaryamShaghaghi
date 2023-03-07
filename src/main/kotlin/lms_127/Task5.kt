package lms_127

fun task5(valueForA: Int, valueForB: Int): Pair<Int, Int> {

	var a = valueForA
	var b = valueForB
	val c = a
	a = b
	b = c

	return Pair(a, b)
}

fun main() {
	println(task5(1, 2))
}