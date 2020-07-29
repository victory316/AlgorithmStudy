package com.example.algorithmstudy

class StringUtil {

    fun arrangeString(s: String): String {
        val array = s.toCharArray().sortedByDescending { it }

        val answerBuffer = StringBuffer()

        array.forEach {
            answerBuffer.append(it)
        }

        return answerBuffer.toString()
    }

    fun makeWeirdString(s: String): String {
        val answerBuffer = StringBuffer()

        s.split(" ").let {
            it.forEach { word ->
                for (childIndex in word.indices) {
                    if ((childIndex % 2) == 0) {
                        answerBuffer.append(word[childIndex].toUpperCase())
                    } else {
                        answerBuffer.append(word[childIndex].toLowerCase())
                    }
                }
                answerBuffer.append(" ")
            }
        }

        answerBuffer.deleteCharAt(answerBuffer.length - 1)


        return answerBuffer.toString()
    }
}