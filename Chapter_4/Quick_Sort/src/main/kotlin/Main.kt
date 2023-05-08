fun main() {
    println(quickSort(array = arrayListOf(10, 5, 2, 3, 3)))
}

fun quickSort(array: List<Int>):List<Int> {
    return if (array.size < 2) array
    else {
        val pivot = array[0]
        val less = array.filter { it <= pivot }.drop(1)
        val greater = array.filter { it > pivot }
        quickSort(less) + pivot + quickSort(greater)
    }
}