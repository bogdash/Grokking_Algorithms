fun main() {
    println(quickSort(array = arrayListOf(10, 5, 2, 3, 3)))
    println(sum(list = arrayListOf(10, 5, 2, 3, 3, 14)))
    println(count(list = arrayListOf(10, 5, 2, 3, 3, 14)))
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

fun sum (list: List<Int>): Int {
    if (list.isEmpty()) return 0
    return list[0] + sum(list.drop(1))
}

fun count(list: List<Int>): Int {
    if (list.isEmpty()) return 0
    return 1 + count(list.drop(1))
}