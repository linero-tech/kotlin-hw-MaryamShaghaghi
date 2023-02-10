package lms_129

fun task10(password: String): Boolean
{
	if (password.length < 6 || password.length > 10)
	{
		return false
	}

	var hasLowerCase = false
	var hasUpperCase = false
	var hasNumber = false
	var hasSpecial = false


	for (element in password)
	{
		if (element.isLowerCase())
		{
			hasLowerCase = true
		}
		else if (element.isUpperCase())
		{
			hasUpperCase = true
		}
		else if (element.isDigit())
		{
			hasNumber = true
		}
		else if (!element.isLetterOrDigit())
		{
			hasSpecial = true
		}
	}
		return hasLowerCase && hasUpperCase && hasNumber && hasSpecial
}

fun main()
	{
		val answer = task10("&0hnhG")
		println(answer)
	}