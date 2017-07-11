package classes


class PersonComparable(val firstName: String, val lastName: String)
    : Comparable<PersonComparable> {
    override fun compareTo(other: PersonComparable): Int {
        return compareValuesBy(this, other, PersonComparable::lastName, PersonComparable::firstName)
    }
}