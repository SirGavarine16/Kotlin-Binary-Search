fun binarySearch(list: IntArray, item: Int): Int? {
    var lowestIndexInList = 0
    var highestIndexInList = list.size - 1
    while (lowestIndexInList <= highestIndexInList) {
        val middleIndex = (lowestIndexInList + highestIndexInList) / 2
        val guess = list[middleIndex]
        if (guess == item)
            return middleIndex
        if (guess > item)
            highestIndexInList = middleIndex - 1
        if (guess < item)
            lowestIndexInList = middleIndex + 1
    }
    return null
}

fun main() {
    val sampleList: IntArray = intArrayOf(1, 3, 4, 5, 6, 9)

    println(binarySearch(sampleList, 3))
    println(binarySearch(sampleList, -2))
}