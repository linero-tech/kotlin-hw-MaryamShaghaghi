package lms_129

fun task10(password: String): Boolean {
	// My solution
	if (password.length < 6 || password.length > 10) {
		return false
	}
	var hasLowerCase = false
	var hasUpperCase = false
	var hasNumber = false
	var hasSpecial = false

	for (element in password) {
		if (element.isLowerCase()) {
			hasLowerCase = true
		} else if (element.isUpperCase()) {
			hasUpperCase = true
		} else if (element.isDigit()) {
			hasNumber = true
		} else if (!element.isLetterOrDigit()) {
			hasSpecial = true
		}
	}
	return hasLowerCase && hasUpperCase && hasNumber && hasSpecial
}

/*

// Chat GPT solution
	return when {
		password.length !in 6..10 -> false
		!password.any { it.isLowerCase() } -> false
		!password.any { it.isUpperCase() } -> false
		!password.any { it.isDigit() } -> false
		!password.any { !it.isLetterOrDigit() } -> false
		else -> true
	}
	}


// Humberto solution
	val regex1 = Regex("[a-z]")
	val regex2 = Regex("[A-Z]")
	val regex3 = Regex("[0-9]")
	val regex4 = Regex("[$#@]")

	return password.length in 6..10 &&
			regex1.containsMatchIn(password) &&
			regex2.containsMatchIn(password) &&
			regex3.containsMatchIn(password) &&
			regex4.containsMatchIn(password)

}

*/

fun main() {
	println(task10("#0hn1hGG"))
}