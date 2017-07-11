package tester

import classes.Person

fun main(args: Array<String>) {
    /*
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    val filteredSequence = people.asSequence()
            .map(Person::name)
            .filter { it.startsWith("A") }
            .toList()
    println(filteredSequence)
    */

    val people = listOf(Person("Alice", 29), Person("Bob", 31),
            Person("Charles", 31), Person("Dan", 21))
    // map goes first, then filter
    println(people.asSequence().map(Person::name).filter { it.length < 4 }.toList())

    // map goes after filter
    println(people.asSequence().filter { it.name.length < 4 }.map(Person::name).toList())
}