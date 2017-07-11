package classes


class Processor<T> {
    fun process(value: T) {
        value?.hashCode()
    }
}