fun main() {
    val array = mutableListOf(5, 1, 6, 2, 10, 3, 2)
    println(selectionSort(array))
}

fun findSmallest(array: MutableList<Int>): Int {
    var smallest = array[0]
    var smallestIndex = 0

    for (item in 1 until array.size) {
        if (array[item] < smallest) {
            smallest = array[item]
            smallestIndex = item
        }
    }

    return smallestIndex
}

fun selectionSort(array: MutableList<Int>): MutableList<Int> {
    val newArray = mutableListOf<Int>()

    while (array.isNotEmpty()) {
        val smallest = findSmallest(array)
        newArray.add(array[smallest])
        array.removeAt(smallest)
    }

    return newArray
}