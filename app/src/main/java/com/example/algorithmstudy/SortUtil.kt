package com.example.algorithmstudy

import java.util.*

class SortUtil {

    // 시간복잡도 O(n^2)
    // 공간복잡도 O(n)
    fun doSelectionSort(target: ArrayList<Int>): ArrayList<Int> {
        var tempInt: Int
        for (x in target.indices) {
            tempInt = target[x]

            for (y in x + 1 until target.size) {
                if (target[y] < tempInt) {
                    tempInt = target[y]

                    // swap
                    target[y] = target[x]
                    target[x] = tempInt
                }
            }
        }

        return target
    }

//    fun doInsertionSort(target: ArrayList<Int>): ArrayList<Int> {
//        val inputLinkedList = LinkedList<Int>()
//        target.toCollection(inputLinkedList)
//
//        var tempInt: Int
//
//        for (x in target.indices) {
//            for (y in x until target.size) {
//                if (target[x] > target[y]) {
//                    tempInt = target[y]
//                    target.add(x, tempInt)
//                    target.remove(y)
//                }
//            }
//        }
//
//        return target
//    }
    /**
     * https://www.youtube.com/watch?v=g-PGLbMth_g
     */

    // 시간복잡도 O(n^2)
    // 공간복잡도 O(n)
    fun doMyInsertionSort(arr: IntArray): IntArray {
        var currentMinimum: Int
        var tempInt: Int

        for (x in arr.indices) {
            currentMinimum = x

            for (y in x + 1 until arr.size) {
                if (arr[currentMinimum] > arr[y]) {
                    currentMinimum = y
                }
            }

            tempInt = arr[x]
            arr[x] = arr[currentMinimum]
            arr[currentMinimum] = tempInt
        }

        return arr
    }
}