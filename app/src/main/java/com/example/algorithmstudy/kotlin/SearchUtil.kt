package com.example.algorithmstudy.kotlin

import android.os.Build
import android.util.ArraySet
import androidx.annotation.RequiresApi
import kotlin.math.abs

class SearchUtil {

    /**
     * 한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.
    각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.
    제한사항
    numbers는 길이 1 이상 7 이하인 문자열입니다.
    numbers는 0~9까지 숫자만으로 이루어져 있습니다.
    013은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
     */
    @RequiresApi(Build.VERSION_CODES.M)
    fun findPrimeNumber(numbers: String) {
        val primeList = ArraySet<Int>()
        val tokenized = numbers.toCharArray()


    }

    fun solution(answers: IntArray): IntArray {

        val studentArray = ArrayList<IntArray>()

        studentArray.add(intArrayOf(1, 2, 3, 4, 5))
        studentArray.add(intArrayOf(2, 1, 2, 3, 2, 4, 2, 5))
        studentArray.add(intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5))

        var correctCount: Int
        var answerIndex = 0
        var answerMap = HashMap<Int, Int>()

        // 학생들의 답안을 차례로 검사
        for (studentIndex in studentArray.indices) {
            correctCount = 0
            answerIndex = 0

            for (index in answers.indices) {

                if (answers[index] == studentArray[studentIndex][answerIndex]) {
                    correctCount++
                }

                answerIndex++

                if (answerIndex == studentArray[studentIndex].size) {
                    answerIndex = 0
                }
            }

            answerMap[studentIndex] = correctCount
        }

//        answerMap.forEach {
//            println(it)
//        }

        val topCorrect = answerMap.maxBy { data -> data.value }!!.value
        val answer = ArrayList<Int>()

        for (answers in answerMap) {
            if (answers.value == topCorrect) {
                answer.add(answers.key + 1)
            }
        }

        answer.sort()

        return answer.toIntArray()
    }

    fun doCarpet(brown: Int, yellow: Int): IntArray {
        val target = brown + yellow

        // width가 항상 크고 첫 index에 들어가야 함.
        var maxWidth = 0
        var maxHeight = 0
        var minDifference = 99999999

        println(target)

        for (divider in 1..target) {
            if (target % divider == 0) {


                if (maxWidth - target / divider > 0) {

                    if (minDifference > maxWidth - target / divider) {
                        minDifference = abs(maxWidth - target / divider)

                        maxWidth = divider
                        maxHeight = target / divider
                    }
                }

            }
        }

        return intArrayOf(maxWidth, maxHeight)
    }
}