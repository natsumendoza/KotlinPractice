package tester


fun main(args: Array<String>) {
    /*
    twoAndThree { a, b -> a + b }
    twoAndThree { a, b -> a * b }
    */

    /*
    println("ab1c".filter { it in 'a'..'z' })
    */

    val letters = listOf("Alpha", "Beta")
    println(letters.joinToStringWithDefaultValue())
    println(letters.joinToStringWithDefaultValue { it.toLowerCase() })
    println(letters.joinToStringWithDefaultValue(separator = "! ", postfix = "! ",
            transform = { it.toUpperCase() }))
}

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("The result is $result")
}

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0..length - 1) {
        val element = get(index)

        if (predicate(element)) sb.append(element)
    }
    return sb.toString()
}

fun String.filterUsingWith(predicate: (Char) -> Boolean): String = with(StringBuilder()) {
    for (index in 0..length - 1) {
        val element = get(index)
        if (predicate(element)) append(element)
    }
    toString()
}

fun <T> Collection<T>.joinToStringWithDefaultValue(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = "",
        transform: ((T) -> String)? = null
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) {
            result.append(separator)
        }

        val str = transform?.invoke(element) ?: element.toString()

        result.append(str)
    }
    result.append(postfix)
    return result.toString()
}