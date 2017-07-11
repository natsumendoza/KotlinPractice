package tester

import classes.PersonMap
import classes.___Person
import java.beans.PropertyChangeListener


fun main(args: Array<String>) {
    /*
    val p = ___Person("Dmitry", 34, 2000)

    p.addPropertyChangeListener(
            PropertyChangeListener { event ->
                println("Property ${event.propertyName} changed from ${event.oldValue} to ${event.newValue}")
            }
    )
    p.age = 15
    p.salary = 2100
    */

    val p = PersonMap()
    val data = mapOf("name" to "Dmitry", "company" to "JetBrains")
    for ((attrName, value) in data) {
        p.setAttribute(attrName, value)
    }
    println(p.name)
}