package tester

import classes.MutablePoint
import classes.PersonComparable
import classes.Point
import classes.Rectangle
import java.math.BigDecimal
import java.time.LocalDate


fun main(args: Array<String>) {
    /*
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)
    */

    /*
    val p = Point(10, 20)
//    println(p * 1.5)
    println(1.5 * p)
    */

    /*
    println('a' * 3)
    */

    /*
    val p = Point(10, 20)
    println(-p)
    */

    /*
    var bd = BigDecimal.ZERO
    println(bd++)
    println(++bd)
    */

    /*
    val p1 = PersonComparable("Alice", "Smith")
    val p2 = PersonComparable("Bob", "Johnson")
    println(p1 < p2)
    */

    /*
    val p = Point(10, 20)
    println(p[1])
    */

    /*
    val p = MutablePoint(10, 20)
    p[1] = 42
    println(p)
    */

    /*
    val rect = Rectangle(Point(10, 20), Point(50, 50))
    println(Point(20, 30) in rect)
    println(Point(5, 5) in rect )
    */

    val newYear = LocalDate.ofYearDay(2017, 1)
    val daysOff = newYear.minusDays(1)..newYear
    for (dayOff in daysOff) { println(dayOff) }
}

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

operator fun Double.times(p: Point): Point {
    return Point((p.x * this).toInt(), (p.y * this).toInt())
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

operator fun <T> MutableCollection<T>.plusAssign(element: T) {
    this.add(element)
}

operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE

operator fun Point.get(index: Int): Int {
    return when(index) {
        0 -> x
        1 -> y
        else ->
                throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

operator fun MutablePoint.set(index: Int, value: Int) {
    when(index) {
        0 -> x = value
        1 -> y = value
        else ->
                throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

operator fun Rectangle.contains(p: Point): Boolean {
    return p.x in upperLeft.x until lowerRight.x && p.y in upperLeft.y until lowerRight.y
}

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
        object : Iterator<LocalDate> {
            var current = start

            override fun hasNext() =
                    current <= endInclusive

            override fun next() = current.apply {
                current = plusDays(1)
            }
        }