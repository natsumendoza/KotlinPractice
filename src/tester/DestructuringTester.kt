package tester

import classes.Point
import classes.splitFileName


fun main(args: Array<String>) {
    /*
    val p = Point(10, 20)

    val (x, y) = p
    println(x)
    println(y)
    */

    /*
    val (name, ext) = splitFileName("example.kt")
    println(name)
    println(ext)
    */

    val map = mapOf("Oracle" to "Java", "Jetbrains" to "Kotlin")
    printEntries(map)
}

fun printEntries(map: Map<String, String>) {
    for ((key, value) in map) {
        println("$key -> $value")
    }
}