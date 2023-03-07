package lms_130

fun task3(items: List<Int>): List<Int>
{

	val uniqueNumber = mutableListOf<Int>()
	val repeatedNumber = mutableSetOf<Int>()

	items.forEach { number ->
		if (number in uniqueNumber)
		{
			repeatedNumber.add(number)
		} else
		{
			uniqueNumber.add(number)
		}
	}

	return repeatedNumber.toList()
}

fun main()
{
	val result = task3(listOf(1, 1, 1, 2, 2, 3))
	println(result)
}