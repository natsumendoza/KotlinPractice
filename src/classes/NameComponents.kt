package classes


data class NameComponents(val name: String, val extension: String)

fun splitFileName(fullName: String): NameComponents {
    val (name, extension) = fullName.split('.', limit = 2)
    return NameComponents(name, extension)
}