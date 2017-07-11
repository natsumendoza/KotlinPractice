package tester

import classes.Person

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    /*
    val list = listOf(1, 2, 3, 4)
    val mappedList = list.map { it * it }
    println(mappedList)
    */

    /*
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
//    val mappedPeople = people.map { it.name } //using lambda
    val mappedPeople = people.map(Person::name)  // using member reference
    println(mappedPeople)
    */

    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.toUpperCase() })

}