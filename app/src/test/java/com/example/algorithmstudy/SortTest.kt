package com.example.algorithmstudy

import com.example.algorithmstudy.kotlin.SortUtil
import org.junit.Test

class SortTest {

    @Test
    fun selectionSortTest() {
        SortUtil()
            .doSelectionSort(arrayListOf(1, 5, 3, 2, 4, 9, 6)).forEach {
            print("[$it]")
        }

        println()

        SortUtil()
            .doSelectionSort(arrayListOf(9, 9, 4, 3, 104, 2, 1, 2)).forEach {
            print("[$it]")
        }
    }

    @Test
    fun insertionSortTest() {

        SortUtil()
            .doInsertionSort(arrayListOf(2,8,5,3,9,4,1)).forEach {
            print("[$it]")
        }

        println()

        SortUtil()
            .doInsertionSort(arrayListOf(9, 4, 3, 104, 1, 2)).forEach {
            print("[$it]")
        }

        println()

        SortUtil()
            .doBubbleSort(intArrayOf(9, 4, 3, 104, 1, 2)).forEach {
            print("[$it]")
        }
    }

    @Test
    fun quickSortTest() {

        SortUtil()
            .doQuickSort(arrayListOf(9,22,1,3,5)).forEach {
            print("$it ")
        }
    }

    @Test
    fun mergeSortTest() {
        SortUtil()
            .doMergeSort(arrayListOf(1,5,4,9,10,3)).forEach {
            print(("$it "))
        }
    }

    @Test
    fun findK() {
        SortUtil()
            .findK(intArrayOf(1,5,2,6,3,7,4), arrayOf(intArrayOf(2,5,3), intArrayOf(4,4,1), intArrayOf(1,7,3)))
    }

    @Test
    fun findInt() {
        SortUtil()
            .findBigInt(intArrayOf(6, 10 ,2))
    }
}