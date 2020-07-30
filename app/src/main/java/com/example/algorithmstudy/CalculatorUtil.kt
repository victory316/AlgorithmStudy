package com.example.algorithmstudy

class CalculatorUtil {

    fun sortWithDivisor(arr: IntArray, divisor: Int): IntArray {
        val answerArray = ArrayList<Int>()

        arr.forEach {
            if (it % divisor == 0) {
                answerArray.add(it)
            }
        }

        answerArray.sort()

        return if (answerArray.size == 0) {
            intArrayOf(-1)
        } else {
            answerArray.toIntArray()
        }
    }

    fun numberWithGap(x: Int, n: Int): LongArray {
        var answer = longArrayOf()
        var answerArray = ArrayList<Long>()

        var inputData = x.toLong()

        for (count in 0 until n) {
            answerArray.add(inputData)
            inputData += x
        }

        return answerArray.toLongArray()
    }
}