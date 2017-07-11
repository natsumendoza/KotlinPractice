import java.io.BufferedReader
import java.io.StringReader

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("das"))
    println(readNumber(reader))
}

fun readNumber(reader: BufferedReader) {
    val number = try {
        val line = reader.readLine()
        Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        null
    }

    println(number)
}