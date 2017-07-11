package tester

import classes.Person

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    /*
    val list = listOf(1, 2, 3, 4)
    val filteredList = list.filter { it % 2 == 0 }
    println(filteredList)
    */

    /*
    val filteredPeople = people.filter { it.age > 30 }
    println(filteredPeople)
    */

    /*
    val filteredAndMappedPeople = people.filter { it.age > 30 }.map(Person::name)
    println(filteredAndMappedPeople)
    */

    val maxAge = people.maxBy(Person::age)?.age
    val filteredPeopleByAge = people.filter { it.age == maxAge }
    println(filteredPeopleByAge)
}