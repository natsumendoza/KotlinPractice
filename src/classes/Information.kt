package classes


class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)

class Company(val name: String, val address: Address?)

class _Person(val name: String, val company: Company?)

class __Person(val firstname: String, val lastName: String) {
    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? __Person ?: return false

        return otherPerson.firstname == firstname && otherPerson.lastName == lastName
    }

    override fun hashCode(): Int =
            firstname.hashCode() * 37 + lastName.hashCode()
}

fun _Person.countryName(): String {
    val country = this.company?.address?.country
    return country ?: "unknown"
}

fun _Person.countryNameSafe() = company?.address?.country ?: "Unknown"

fun printShippingLabel(person: _Person) {
    val address = person.company?.address ?: throw IllegalArgumentException("No address")
    with(address) {
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}

fun main(args: Array<String>) {
    /*
    val address = Address("Elsester. 47", 80687, "Munich", "Germany")
    val jetbrains = Company("Jetbrains", address)
    val person = _Person("Dmitry", jetbrains)

    printShippingLabel(person)
    printShippingLabel(_Person("Alexey", null))
    */

    val p1 = __Person("Dmitry", "Jemerov")
    val p2 = __Person("Dmitry", "Jemerov")

    println(p1 == p2)
    println(p1.equals(42))
}