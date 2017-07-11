package tester


fun main(args: Array<String>) {
    ignoreNulls(null)
}

fun ignoreNulls(s: String?) {
    val sNotNull: String = s!!
    println(sNotNull.length)
}