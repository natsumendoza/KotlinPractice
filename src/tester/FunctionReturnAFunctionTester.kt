package tester

import classes.*


fun main(args: Array<String>) {
    /*
    val calculator = getShippingCostCalculator(Delivery.EXPEDITED)

    println("Shipping costs ${calculator(Order(3))}")
    */

    val contacts = listOf(PersonReturnFunction("Dmitry", "Jemerov", "123-4567"),
            PersonReturnFunction("Svetlana", "Isakova", null))
    val contactListFilters = ContactListFilters()
    with(contactListFilters) {
        prefix = "Dm"
        onlyWithPhoneNumber = true
    }
    println(contacts.filter(contactListFilters.getPredicate()))

}