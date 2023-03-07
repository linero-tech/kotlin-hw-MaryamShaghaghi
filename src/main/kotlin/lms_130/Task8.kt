package lms_130

fun task8(list: List<Int>): List<Int>
{
	// Initialize a hash set to hold the top 3 unique values
	val topThree = HashSet<Int>()

	// Loop through the list of integers
	for (item in list)
	{
		// Add the current item to the set
		topThree.add(item)

		// Remove any extra elements from the set
		while (topThree.size > 3)
		{
			topThree.remove(topThree.minOrNull())
		}
	}

	// Convert the set to a sorted list and return it
	return topThree.toList().sorted()
}

fun main()
{
	val result = task8(listOf(1, 2, 2))
	println(result)
}