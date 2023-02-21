package lms_130

fun task8(items: List<Int>): List<Int>
{
	val setItem = items.toMutableSet()
	var firstHighValue = 0
	var secondHighValue = 0
	var thirdHighValue = 0

	setItem.forEach { num1 ->
		if (num1 > firstHighValue)
		{
			firstHighValue = num1
		}
	}
	val newItems = setItem.minus(firstHighValue)
	newItems.forEach { num2 ->
		if (num2 > secondHighValue)
		{
			secondHighValue = num2
		}
	}
	val newItems2 = newItems.minus(secondHighValue)
	newItems2.forEach { num3 ->
		if (num3 > thirdHighValue)
		{
			thirdHighValue = num3
		}
	}

	return listOf(firstHighValue, secondHighValue, thirdHighValue)
}

fun main()
{
	val result = task8(listOf(60, 9, 7, 10))
	println(result)
}