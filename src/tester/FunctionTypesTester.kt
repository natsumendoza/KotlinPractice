package tester


fun main(args: Array<String>) {

}

val sum: (Int, Int) -> Unit = { x, y -> x + y }

val action: () -> Unit = { println(42) }

var funOrNull: ((Int, Int) -> Int)? = null
