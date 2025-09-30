object Bob {
    fun hey(input: String): String {
        val trimmed = input.trim()
        val hasUpperCase = input.any { it.isUpperCase() }
        val isQuestion = trimmed.endsWith("?")
        val isEmpty = trimmed.isEmpty()

        return when {
            isEmpty -> "Fine. Be that way!"
            hasUpperCase && isQuestion -> "Calm down, I know what I'm doing!"
            hasUpperCase -> "Whoa, chill out!"
            isQuestion -> "Sure."
            else -> "Whatever."
        }
    }
}
