package lms_130

fun task5(items: List<Int>): List<Int>
{

	val multiplyByIndex = mutableListOf<Int>()

	items.forEachIndexed { index, number ->
		multiplyByIndex.add(index * number)
	}

	return multiplyByIndex
}

fun main()
{
	val result = task5(listOf(1, 5, 11))
	println(result)
}