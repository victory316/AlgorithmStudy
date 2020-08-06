package com.example.algorithmstudy.kotlin

class GreedyUtil {

    fun solution(number: String, k: Int): String {
        val charArray = number.toCharArray()

        val parsedArray = ArrayList<Int>()

        charArray.forEach {
            parsedArray.add(Integer.parseInt(it.toString()))
        }

        var minNumber = 1
        var deletedCount = 0
        var wasExist = false

        while (deletedCount != k) {
            wasExist = false

            println()

            for (index in parsedArray.indices) {
                print(parsedArray[index])
                if (parsedArray[index] == minNumber) {
                    wasExist = true

                    parsedArray.removeAt(index)
                    deletedCount++

                    break
                }
            }

            if (!wasExist) minNumber++
        }

        val answerBuffer = StringBuffer()

        parsedArray.forEach {
            answerBuffer.append(it)
        }

        return answerBuffer.toString()
    }
}