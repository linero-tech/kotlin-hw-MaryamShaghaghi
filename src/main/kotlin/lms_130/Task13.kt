package lms_130

fun task13_1(customers: List<String>): List<String> {

    val result = customers.toMutableSet()
    return result.toList()
}

fun task13_2(customers: List<String>): List<String> {

    val multipleTimes = mutableListOf<String>()
    val oneTime = mutableListOf<String>()

    customers.forEach { customer ->
        if (customer in oneTime)
        {
            multipleTimes.add(customer)
        }
        else
        {
            oneTime.add(customer)
        }
    }
    return multipleTimes.toSet().toList()
}

fun task13_3(customers: List<String>): List<String> {

    val companies = mutableSetOf<String>()
    customers.forEach { element ->
        val index1 = element.indexOf("@")
        val index2 = element.indexOf(".")
        val company = "${element.subSequence(index1 +1 , index2)}"
        companies.add(company)
    }
    return companies.toList()
}

fun main() {
    val listOfCustomer = listOf(
        "tgundrey1l@prlog.org",
        "bgrix1u@apache.org",
        "mbreakspear1v@wordpress.com",
        "cdalli1w@ft.com",
        "rclayborn1x@mtv.com",
        "rclayborn1x@mtv.com",
        "jchidlow1y@nasa.gov",
        "jchidlow1y@nasa.gov",
        "kovell1z@washingtonpost.com",
        "kovell1z@washingtonpost.com",
        "kovell1z@washingtonpost.com"
    )

    println("The customers who purchased from your product: ${task13_1(listOfCustomer)}")
    println("The customers that purchased multiple times include: ${task13_2(listOfCustomer)}")
    println("The companies that purchased from you include: ${task13_3(listOfCustomer)}")
}
