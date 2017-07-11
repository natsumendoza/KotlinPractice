package tester


fun main(args: Array<String>) {
    verifyUserInput(" ")
}

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("Please fill in the required fields")
    }
}