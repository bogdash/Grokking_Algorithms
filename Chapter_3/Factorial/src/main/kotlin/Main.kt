fun main() {
    println(fibonacci(7))
}

fun fibonacci (x: Int): Int {
    return if (x == 1) x
    else x * fibonacci(x - 1)
}