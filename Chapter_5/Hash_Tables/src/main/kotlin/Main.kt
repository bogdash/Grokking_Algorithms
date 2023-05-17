fun main() {
    val book = mapOf(
        "apple" to 0.67,
        "milk" to 1.49,
        "avocado" to 1.49
    )

    println(book)
    println(book["avocado"])

    checkVoter("Tom")
    checkVoter("Mike")
    checkVoter("Mike")
}

val voted = mutableMapOf<String, Boolean>()

fun checkVoter(name: String) {

    if (voted[name] == true) {
        println("kick them out!")
    }
    else {
        voted[name] = true
        println("let them vote!")
    }
}
