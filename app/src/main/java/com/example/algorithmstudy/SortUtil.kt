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
                    Collections.swap(target, y, x)
                }
            }
        }

        return target
    }

    /**
     * https://www.youtube.com/watch?v=g-PGLbMth_g
     */
    // 시간복잡도 O(n^2)
    // 공간복잡도 O(n)
    fun doInsertionSort(arr: IntArray): IntArray {
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

    fun doBubbleSort(arr: IntArray): IntArray {
        var tempInt: Int

        for (x in 1 until arr.size) {

            for (y in 0 until arr.size - 1) {
                if (arr[x] < arr[y]) {
                    tempInt = arr[x]
                    arr[x] = arr[y]
                    arr[y] = tempInt
                }
            }
        }

        return arr
    }

    fun doQuickSort(data: ArrayList<Int>) : ArrayList<Int>{
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