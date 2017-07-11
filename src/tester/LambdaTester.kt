package tester

import classes.Person

fun main(args: Array<String>) {
//    val people = listOf(Person("Alice", 29), Person("Bob", 31))
//    val names = people.joinToString(" ") { p: Person -> p.name }
//    println(names)

    /*
    val getAge = { p: Person -> p.age }
    people.maxBy(getAge)
    println(people)
    */

    /*
    val sum = { x: Int, y: Int ->
        println("Computing the sum of $x and $y")
        x + y
    }

    sum(1, 2)
    */

    /*
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessageWithPrefix(errors, "Error: ")
    */

    val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")
    printProblemCounts(responses)

}

fun printMessageWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}

fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0

    var serverErrors = 0
    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}