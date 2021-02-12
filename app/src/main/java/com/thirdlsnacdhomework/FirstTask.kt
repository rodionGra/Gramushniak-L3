package com.thirdlsnacdhomework

/**
 *  Rodion Gramushniak
 *
 *  There is a list, some elements of which are repeated several times.
 *  Find the items that are repeated most often.
 **/

fun main() {
    // If the number of repetitions is unique (only 2 occurs three times)
    val someArray = intArrayOf(1, 1, 2, 2, 2, 3, 4, 5, 6, 7, 8)

    println("The number that is repeated most often =  "
            + someArray.groupBy { it }.maxBy { it.value.size }?.key + "\n\n"
    )


    // There can be several numbers that are repeated the same maximum times
    val list =
        mutableListOf<String>("a", "b", "b", "b", "c", "c", "d", "d", "d", "e", "e", "g", "g", "g")
    println(list)

    val map = maxCountRepetitions(list)   //key is element of list, value is count of repetitions
    for ((k, v) in map) {
        println("Element $k is repeated $v times")
    }
}

/*
Fun run over all elements of the array and check if there is already such an element in the map.
If it is not there, we put in the map a Pair <this element, 1> (he met for the first time).
If it already was, then by the key of this element we increase the number of repetitions by 1.
*/
fun <K, C : Collection<K>> maxCountRepetitions(arr: C): Map<K, Int> {

    val result = HashMap<K, Int>()

    arr.forEach {
        var count = result[it]
        if (count == null)
            count = 0
        result[it] = ++count
    }

    val pairWithMaxValue = result.maxBy { it.value }

    return result.filter { it.value == pairWithMaxValue?.value }
}