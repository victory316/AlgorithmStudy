package com.example.algorithmstudy

/**
 *  Collection을 다루는 기초적인 Solution
 */
class SumOfDividers {

    fun solution(n: Int): Int {

        val dividerList = ArrayList<Int>()

        for (divider in 1..n) {
            if (n % divider == 0) {

                dividerList.add(divider)
            }
        }


        var answer = 0

        dividerList.forEach {
            answer += it
        }

        return answer
    }

    // Array 평균 구하기
    fun sumOfArray(arr: IntArray): Double {
        return  arr.sum().toDouble() / arr.size
    }

    // 가장 작은 value를 제거한 Array 구하기
    fun dropMinValue(arr: IntArray): IntArray {

        var index = 0
        var frontList = emptyList<Int>()
        var backList = emptyList<Int>()

        arr.forEach {
            if (it == arr.min()) {
                frontList = arr.dropLast(arr.size - index)
                backList = arr.drop(index + 1)
            }

            index++
        }

        val resultArray = ArrayList<Int>()
        resultArray.addAll(frontList)
        resultArray.addAll(backList)

        return if (resultArray.isEmpty()) {
            intArrayOf(-1)
        } else {
            resultArray.toIntArray()
        }
    }
}