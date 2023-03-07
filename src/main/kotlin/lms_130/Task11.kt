package lms_130

fun task11_1(guests: List<String>): Int
{
	var totalGuests = 0
	guests.forEach { element ->
		totalGuests += 1
	}
	return totalGuests
}

fun task11_2(guests: List<String>, condition: String): List<String>
{
	val filterGuests = mutableListOf<String>()
	guests.forEach { element ->
		val gustsCondition = "-${element.last()}"

		if (gustsCondition == condition)
		{
			filterGuests.add(element)
		}
	}
	return filterGuests.toList()

}

fun main()
{

	// Change the condition to either "-V", "-A", or "-K" to test your code under different conditions
	val conditionOfInterest = "-K"
	val listOfAttendees = listOf(
		"Stéphanie-A",
		"Edmée-K",
		"Maëlla-K",
		"Océanne-K",
		"Géraldine-K",
		"Maëline-K",
	)

	println("The event has a total of ${task11_1(listOfAttendees)} attendees.")
	println("The attendees with condition $conditionOfInterest are ${task11_2(listOfAttendees, conditionOfInterest)}")
}
