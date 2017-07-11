package tester

import classes.Processor
import java.util.*


fun main(args: Array<String>) {
    /*
    println(oneHalf(3))

    println(max("kotlin", "java"))
    */

    /*
    val helloWorld = StringBuilder("Hello World")
    ensureTrailingPeriod(helloWorld)
    println(helloWorld)
    */

    /*
    val nullableStringProcessor = Processor<String?>()
    nullableStringProcessor.process(null)
    */

    /*
    printSum(listOf(1, 2, 3))
    */

    /*
    println(isA<String>("abc"))
    println(isA<String>(123))
    */

    val items = listOf("one", 2, "three")
    println(items.filterIsInstance<String>())

}

fun <T : Number> oneHalf(value: T): Double = value.toDouble() / 2.0

fun <T : Comparable<T>> max(first: T, second: T): T =
        if (first > second) first else second

fun <T> ensureTrailingPeriod(seq: T)
    where T : CharSequence, T : Appendable {
    if (!seq.endsWith('.')) {
        seq.append('.')
    }
}

fun printSum(c: Collection<*>) {
    val inList = c as? List<Int> ?: throw IllegalArgumentException("List is expected")
    println(inList.sum())
}

inline fun <reified T> isA(value: Any) = value is T

inline fun <reified T> Iterable<*>.filterIsInstance(): List<T> {
    val destination = mutableListOf<T>()
    for (element in this) {
        if (element is T) {
            destination.add(element)
        }
    }
    return destination
}
