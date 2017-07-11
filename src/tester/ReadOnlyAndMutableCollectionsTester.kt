package tester


fun main(args: Array<String>) {
    val source: Collection<Int> = arrayListOf(3, 5, 7)
    val target: MutableCollection<Int> = arrayListOf(1)
    copyElements(source, target)
    println(target)
}

fun <T> copyElements(source: Collection<T>, target: MutableCollection<T>) {
    source.forEach {
        target.add(it)
    }
}