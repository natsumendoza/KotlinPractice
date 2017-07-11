package tester

fun main(args: Array<String>) {
    println(alphabetUsingWith())
}

fun alphabet(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("\nNow I know the alphabet")
    return result.toString()
}

fun alphabetUsingWith(): String {
    val stringBuilder = StringBuilder()

    return with(stringBuilder) {
        for (letter in 'A'..'Z') {
            append(letter)
        }
        append("\nNow I know the alphabet")
        this.toString()
    }
}

fun alphabetOptimizedUsingWith(): String = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet")
    toString()
}