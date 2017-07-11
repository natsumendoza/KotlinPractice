fun main(args: Array<String>) {
    val (number, name) = 1 to "one"
}

infix fun Any.to(other: Any) = Pair(this, other)