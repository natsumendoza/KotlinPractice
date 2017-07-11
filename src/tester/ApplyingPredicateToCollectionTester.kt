package tester

import classes.Person

fun main(args: Array<String>) {
    /*
    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    val canBeInClub27 = { p: Person -> p.age <= 27 }
    println("all: ${people.all(canBeInClub27)}")
    println("any: ${people.any(canBeInClub27)}")

    println("count: ${people.count(canBeInClub27)}")
    println("find: ${people.find(canBeInClub27)}")
    */

    /*
    val people = listOf(Person("Alice", 31), Person("Bob", 29), Person("Carol", 31))
    println(people.groupBy { it.age })
    */

    val list = listOf("a", "ab", "b")
    println(list.groupBy(String::first))
}
