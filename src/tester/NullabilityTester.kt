package tester


fun main(args: Array<String>) {
    printAllCaps("abc")
    printAllCaps(null)
}

fun strLen(s: String?) = if (s != null) s.length else 0

fun strLenSafe(s: String?): Int = s?.length ?: 0

fun printAllCaps(s: String?) {
    val allCaps: String? = s?.toUpperCase()
    println(allCaps)

}