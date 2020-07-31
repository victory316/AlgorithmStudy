package com.example.algorithmstudy

import org.junit.Test

class SortTest {

    @Test
    fun selectionSortTest() {
        SortUtil().doSelectionSort(arrayListOf(1, 5, 3, 2, 4, 9, 6)).forEach {
            print("[$it]")
        }

        println()

        SortUtil().doSelectionSort(arrayListOf(9, 9, 4, 3, 104, 2, 1, 2)).forEach {
            print("[$it]")
        }
    }

    @Test
    fun insertionSortTest() {

        SortUtil().doMyInsertionSort(intArrayOf(2,8,5,3,9,4,1)).forEach {
            print("[$it]")
        }

        println()

        SortUtil().doMyInsertionSort(intArrayOf(9, 4, 3, 104, 1, 2)).forEach {
            print("[$it]")
        }
    }
}