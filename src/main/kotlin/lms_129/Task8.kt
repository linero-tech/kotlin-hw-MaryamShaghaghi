package lms_129

fun task8(number: Int): Int {
    var result = 0
    var num = number
    while (num > 0) {
        val remainder = num % 10
        result += remainder
        num /= 10
    }
    return result
}
fun main()
{
  val answer = task8(123)
  println(answer)
}