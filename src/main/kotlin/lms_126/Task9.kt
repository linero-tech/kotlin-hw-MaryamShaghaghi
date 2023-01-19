package lms_126

fun task9(): String {

    return """
        INPUT Password
        IF Password is correct
         OUTPUT "Inter amount to withdraw"
         ELSE
         OUTPUT "Password is wrong"
         INPUT Amount
         IF Amount < Account Balance
         OUTPUT "Operation Is Successfully Done"
         ELSE 
         OUTPUT "Operation is failed"
    """.trimIndent()
}