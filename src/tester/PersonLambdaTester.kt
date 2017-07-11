package tester

import classes.Person

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    people.maxBy { p -> p.age }
}