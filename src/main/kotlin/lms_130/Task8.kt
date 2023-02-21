package lms_130

fun task8(items: List<Int>): List<Int>
{
	val setItem = items.toMutableSet()
	var firstHighValue = Int.MAX_VALUE * -1
	var secondHighValue = Int.MAX_VALUE * -1
	var thirdHighValue = Int.MAX_VALUE * -1

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

	return listOf(thirdHighValue, secondHighValue, firstHighValue)
}

fun main()
{
	val result = task8(listOf(60, 9, 7, 10))
	println(result)
}