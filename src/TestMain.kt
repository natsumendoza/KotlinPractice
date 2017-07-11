import Color.*

fun main(args: Array<String>) {
//    println(getMnemonic(BLUE))
//    println(getWarmth(ORANGE))
//    println(mixOptimized(BLUE, YELLOW))

//    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))

//    for(i in 1..100) {
//        print(fizzBuzz(i))
//    }

    for(i in 100 downTo 1 step 2) {
        print(fizzBuzz(i))
    }
}

fun getMnemonic(color: Color) =
        when(color) {
            RED -> "Richard"
            ORANGE -> "Of"
            YELLOW -> "York"
            GREEN -> "Gave"
            BLUE -> "Battle"
            INDIGO -> "In"
            VIOLET -> "Vain"
        }

fun getWarmth(color: Color) =
        when(color) {
            RED, ORANGE, YELLOW -> "warm"
            GREEN -> "neutral"
            BLUE, INDIGO, VIOLET -> "cold"
        }

fun mix(c1: Color, c2: Color) =
        when(setOf(c1, c2)) {
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            setOf(BLUE, VIOLET) -> INDIGO

            else -> throw Exception("Dirty color")
        }

fun mixOptimized(c1: Color, c2: Color) =
        when {
            (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORANGE
            (c1 == YELLOW && c2 == BLUE) || (c1 == BLUE && c2 == YELLOW) -> GREEN
            (c1 == BLUE && c2 == VIOLET) || (c1 == VIOLET && c2 == BLUE) -> INDIGO

            else -> throw Exception("Dirty color")
        }



//fun evalWithLogging(e: Expr()): Int =
//        when(e) {
//            is Expr.Num -> {
//                println("num: ${e.value}")
//
//                e.value
//            }
//            is Expr.Sum -> {
//                val left = evalWithLogging(e.left)
//                val right = evalWithLogging(e.right)
//                println("sum: $left + $right")
//
//                left + right
//            }
//            else -> throw IllegalArgumentException("Unknown Expression")
//        }

fun fizzBuzz(i: Int) = when
{
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}