package com.example.algorithmstudy

import java.util.*
import kotlin.collections.ArrayList

class SortUtil {

    /**
     * https://www.youtube.com/watch?v=g-PGLbMth_g
     */
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
                    Collections.swap(target, y, x)
                }
            }
        }

        return target
    }
    // 시간복잡도 O(n^2)
    // 공간복잡도 O(n)
    fun doInsertionSort(arr: ArrayList<Int>): ArrayList<Int> {
        var compareIndex : Int

        for (x in arr.indices) {
            compareIndex = x

            while (compareIndex > 0 && arr[compareIndex - 1] > arr[compareIndex]) {
                Collections.swap(arr, compareIndex - 1, compareIndex)
                compareIndex--
            }
        }

        return arr
    }

    fun doBubbleSort(arr: IntArray): IntArray {
        var tempInt: Int

        for (x in 1 until arr.size) {

            for (y in 0 until arr.size - 1) {
                if (arr[y] > arr[y + 1]) {
                    tempInt = arr[y]
                    arr[y] = arr[y + 1]
                    arr[y + 1] = tempInt
                }
            }
        }

        return arr
    }

    fun doQuickSort(data: ArrayList<Int>): ArrayList<Int> {
        if (data.size <= 1) return data

        val leftList = ArrayList<Int>()
        val rightList = ArrayList<Int>()

        val pivot = data[0]

        for (index in 1 until data.size) {

            if (pivot > data[index]) {
                leftList.add(data[index])
            } else {
                rightList.add(data[index])
            }
        }

        val resultList = ArrayList<Int>()

        resultList.addAll(doQuickSort(leftList))
        resultList.add(pivot)
        resultList.addAll(doQuickSort(rightList))

        return resultList
    }

    fun doMergeSort(data: MutableList<Int>): MutableList<Int> {

        if (data.size <= 1) return data

        val medium = data.size / 2

        val leftList = doMergeSort(data.subList(0, medium))
        val rightList = doMergeSort(data.subList(medium, data.size))

        return merge(leftList, rightList)
    }

    private fun merge(left: MutableList<Int>, right: MutableList<Int>): MutableList<Int> {
        val mergedList = ArrayList<Int>()
        var leftPoint = 0
        var rightPoint = 0

        while (left.size > leftPoint && right.size > rightPoint) {
            if (left[leftPoint] > right[rightPoint]) {
                mergedList.add(right[rightPoint])
                rightPoint++
            } else {
                mergedList.add(left[leftPoint])
                leftPoint++
            }
        }

        while (left.size > leftPoint) {
            mergedList.add(left[leftPoint])
            leftPoint++
        }

        while (right.size > rightPoint) {
            mergedList.add(right[rightPoint])
            rightPoint++
        }

        return mergedList
    }

    fun findK(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = ArrayList<Int>()
        val listToHandle = array.toList()

        listToHandle.forEach {
            print(it)
        }

        commands.forEach {
            it.forEach {
                print(it)
            }
            println()
        }

        commands.forEach {
            answer.add(listToHandle.subList(it[0] - 1, it[1]).sorted()[it[2] - 1])
        }

        return answer.toIntArray()
    }

    fun findBigInt(numbers: IntArray): String {
        numbers.sortedBy { number -> number / 10 }
        numbers.forEach {
            println(it)
        }
        var answer = ""
        return answer
    }

    fun hIndex(citations: IntArray): Int {


        var answer = 0
        return answer
    }
}