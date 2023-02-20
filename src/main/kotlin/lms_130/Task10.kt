package lms_130

fun task10(items: List<Int>): List<Int>
{
    val result = mutableListOf<Int>()

    items.forEach { number ->
        if (number % 2 == 0)
        {
            result.add(number * 2)
        }
        else if (number % 2 ==1)
        {
            result.add(number * 3)
        }
    }

    return result.toList()
}
fun main() {
    val answer = task10(listOf(1, 2, 3, 4, 5))
    println(answer)



}