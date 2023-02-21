package lms_130

fun task12_1(sells: List<Int>): String
{
	var max = sells.first()
	var index = sells.indexOf(sells.first())
	sells.forEachIndexed { index, number ->
		if (number > max)
		{
			max = number
		}
	}
	index = sells.indexOf(max)
	val result = when (index)
	{
		0 -> "Monday"
		1 -> "Tuesday"
		2 -> "Wednesday"
		3 -> "Thursday"
		4 -> "Friday"
		5 -> "Saturday"
		6 -> "Sunday"
		else -> "invalid"
	}
	return result
}

/*
fun main() {
    val answer = task12_1(listOf(20, 100, 800, 768, 765, 90, 10))
    println(answer)
}

 */
fun task12_2(sells: List<Int>): String
{
	var min = sells.first()
	var index = sells.indexOf(sells.first())
	sells.forEachIndexed { index, number ->
		if (number < min)
		{
			min = number
		}
	}
	index = sells.indexOf(min)
	val result = when (index)
	{
		0 -> "Monday"
		1 -> "Tuesday"
		2 -> "Wednesday"
		3 -> "Thursday"
		4 -> "Friday"
		5 -> "Saturday"
		6 -> "Sunday"
		else -> "invalid"
	}
	return result
}

/*fun main() {
    val answer = task12_2(listOf(20, 100, 800, 768, 765, 90, 10))
    println(answer)
}


*/
fun task12_3(sells: List<Int>): Int
{
	var totalSells = 0
	sells.forEach { number ->
		totalSells += number
	}
	return totalSells
}

fun main()
{
	val answer = task12_3(listOf(20, 100, 800, 768, 765, 90, 10))
	println(answer)
}