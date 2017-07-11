package tester

import classes.Book

fun main(args: Array<String>) {
    /*
    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })
    */

    val books = listOf(Book("Thursday Next", listOf("Jasper Fforde")),
            Book("Mort", listOf("Terry Pratchett")),
            Book("Good Omens", listOf("Terry Pratchett", "Neal Gaiman")))
    println(books.flatMap { it.authors }.toSet())
}