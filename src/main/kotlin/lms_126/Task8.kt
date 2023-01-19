package lms_126

fun task8(): String {

    return """
        INPUT X
        IF X % 3 = 0
        OUTPUT "Foo"
        IF X % 5 = 0
        OUTPUT "Bar"
        IF X % 15 = 0
        OUTPUT "FooBar"
        ELSE 
        OUTPUT "Qix"
    """.trimIndent()
}
