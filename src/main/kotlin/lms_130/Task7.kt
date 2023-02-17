package lms_130

fun task7(items: List<Int>): Int
{

    var smallestValue = items.first()
    return if (items.isEmpty())
    {
         0
    }
    else
    {
        items.forEach { number ->
            if (number < smallestValue)
            {
                smallestValue = number
            }
        }
        return  smallestValue
    }

}
fun main()
{
    val result = task7(listOf(10, 5, 11))
    println(result)
}