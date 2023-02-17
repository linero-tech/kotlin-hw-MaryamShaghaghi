package lms_130

fun task4(items: List<Int>, factor: Int): List<Int>
{

    val factorOfFactor = mutableSetOf<Int>()

    items.forEach { number ->
        if (number % factor == 0)
        {
            factorOfFactor.add(number)
        }
    }

    return factorOfFactor.toList()
}
fun main()
{
    val result = task4(listOf(1, 2, 4, 5, 6, 6, 6),2)
    println(result)
}