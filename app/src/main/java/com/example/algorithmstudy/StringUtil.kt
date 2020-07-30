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

    fun sortTwice(strings: Array<String>, n: Int): Array<String> {
        strings.sort()
        strings.sortBy { it[n] }

//        var answer = arrayOf<String>()
        return strings
    }


    fun checkIsDigit(s: String): Boolean {
        val charArray = s.toCharArray()
        val integerArray = charArrayOf('1','2','3','4','5','6','7','8','9','0')

        if (charArray.size != 4|| charArray.size != 6) return false

        charArray.forEach {

            if (!integerArray.contains(it)) return false
        }

        return true
    }

    fun doCecar(s: String, n: Int): String {
        val charArray = s.toCharArray()
        val resultBuffer = StringBuffer()

        val lowerStart = 'a'.toInt()
        val lowerEnd = 'z'.toInt()
        val upperEnd = 'Z'.toInt()


        charArray.forEach {char ->

            if (char == ' ') {
                resultBuffer.append(' ')
            } else if (char.isUpperCase()) {
                (char.toInt() + n).let {
                    if (it > upperEnd) {
                        resultBuffer.append((it - (lowerEnd - lowerStart + 1)).toChar())
                    } else {
                        resultBuffer.append(it.toChar())
                    }
                }
            } else {
                (char.toInt() + n).let {
                    if (it > lowerEnd) {
                        resultBuffer.append((it - (lowerEnd - lowerStart + 1)).toChar())
                    } else {
                        resultBuffer.append(it.toChar())
                    }
                }
            }

        }

        return resultBuffer.toString()
    }
}