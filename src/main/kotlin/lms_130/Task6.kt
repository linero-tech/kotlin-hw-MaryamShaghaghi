package lms_130

fun task6(sentence: String): String
{

    var upperCase = ""

    sentence.forEachIndexed { index, character ->
        upperCase += if (index % 2 == 0)
        {
            character.uppercaseChar()
        }
        else
        {
            character
        }
    }
    return upperCase
}
fun main()
{
    val result = task6("I like Gothenburg")
    println(result)
}