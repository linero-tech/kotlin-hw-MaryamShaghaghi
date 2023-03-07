package lms_130

fun task2(items: List<Int>): Int {

	var result = 0
	return if (items.isEmpty()) {
		0
	} else {

		items.forEachIndexed { index, number ->
			if (index % 2 == 0) {
				result += number
			}
		}
		return result
	}
}

fun main() {
	println(task2(listOf(1, 2, 3, 4)))
}

