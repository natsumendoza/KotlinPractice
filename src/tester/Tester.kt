package tester

import classes.Button
import classes.User

fun main(args: Array<String>) {
//    val button = Button()
//
//    button.showOff()
//
//    button.setFocus(true)
//
//    button.click()

    val alice = User("Alice")
    println(alice.isSubscribed)

    val bob = User("Bob", isSubscribed = false)
    println(bob.isSubscribed)
}