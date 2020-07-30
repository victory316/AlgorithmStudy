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
        val integerArray = charArrayOf('1', '2', '3', '4', '5', '6', '7', '8', '9', '0')

        if (charArray.size != 4 || charArray.size != 6) return false

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


        charArray.forEach { char ->

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

    fun collatz(num: Int): Int {
        var numInput = num.toLong()
        var loopCount = 0

//        if (numInput == 1L) return 1

        while (numInput != 1L) {
            if (numInput % 2 == 0L) {
                numInput /= 2
            } else {
                numInput *= 3
                numInput++
            }

            loopCount++

            if (loopCount > 500) return -1
        }

        return loopCount
    }

    fun sumBetweenNumber(a: Int, b: Int): Long {
        var answer: Long = 0
        var startPoint = 0
        var endPoint = 0

        if (a >= b) {
            startPoint = b
            endPoint = a
        } else {
            startPoint = a
            endPoint = b
        }

        println("start : $startPoint end : $endPoint")

        for (number in startPoint..endPoint) {
            answer += number

            println("$number | $answer")
        }

        return answer
    }

    fun drawStars() {
        val (a, b) = readLine()!!.split(' ').map(String::toInt)
        for (indexA in 0 until b) {
            for (indexB in 0 until a) {
                print("*")
            }
            println()
        }
    }

    fun solution(s: String): String {
        val charArray = s.split(' ')
        val answerBuffer = StringBuffer()
        var biggest = -999999999
        var smallest = 999999999

        charArray.forEach {
            if (smallest > it.toInt()) {
                smallest = it.toInt()
            }

            if (biggest < it.toInt()) {
                biggest = it.toInt()
            }
        }

        answerBuffer.append("$smallest $biggest")
        return answerBuffer.toString()
    }
}