package lms_130

fun task9(items: List<Int>): List<Int> {
	val result = mutableListOf<Int>()

	items.forEachIndexed { index, number ->
		if (index == 0) {
			result.add(number * number)
		} else {
			result.add(number * items[index - 1])

		}
	}
	return result.toList()
}

fun main() {
	println(task9(listOf(5, 2, 3, 4)))
}