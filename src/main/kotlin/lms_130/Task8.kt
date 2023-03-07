package lms_130

fun task8(list: List<Int>): List<Int> {
	val topThree = HashSet<Int>()

	for (item in list) {
		topThree.add(item)
		while (topThree.size > 3) {
			topThree.remove(topThree.minOrNull())
		}
	}

	return topThree.toList().sorted()
}

fun main() {
	println(task8(listOf(1, 2, 2)))
}