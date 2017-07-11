import strings.joinToString
import strings.lastCharSb
import strings.lastChar as last

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
//    println(joinToString(list, separator = "; "))
    println("Kotlin".last())
    val sb = StringBuilder("Kotlin")
    sb.lastCharSb = '!'
    println(sb)
}

