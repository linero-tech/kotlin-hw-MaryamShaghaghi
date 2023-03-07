package lms_130

fun task7(items: List<Int>): Int {
	
	return if (items.isEmpty()) {
		0
	} else {
		var smallestValue = items.first()
		items.forEach { number ->
			if (number < smallestValue) {
				smallestValue = number
			}
		}
		return smallestValue
	}

}

fun main() {
	println(task7(listOf()))
}