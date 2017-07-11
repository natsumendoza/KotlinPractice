package interfaces


interface Producer<out T> {
    fun produce(): T
}