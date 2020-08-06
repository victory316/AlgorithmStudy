package com.example.algorithmstudy.kotlin

import java.util.*

class QueueUtil {
    fun getPrintOrder(priorities: IntArray, location: Int): Int {
        val inputQueue: Queue<Pair<Int, Int>> = LinkedList()

        // 최초 Queue 설정
        for (index in priorities.indices) {
            inputQueue.offer(Pair(index, priorities[index]))
        }

        var result = 0

        // 인쇄 순서를 저장하는 ArrayList
        var orderList = ArrayList<Pair<Int, Int>>()
        var wasExist = false

        while (inputQueue.isNotEmpty()) {

            var tempOrder = Pair(0, 0)
            wasExist = false

            for (data in inputQueue) {
                if (data.second > inputQueue.peek()!!.second) {
                    wasExist = true
                    tempOrder = inputQueue.peek()!!
                }
            }

            if (wasExist) {
                inputQueue.offer(tempOrder)
                inputQueue.poll()
            } else {
                orderList.add(inputQueue.poll()!!)
            }
        }

        orderList.forEach {
            result++

            if (it.first == location) return result
        }

        return result
    }

    fun solution(p: String): String {
        val charArray = p.toCharArray()

        val leftQueue: Queue<Char> = LinkedList()
        val tempRightQueue: Queue<Char> = LinkedList()
        val resultQueue: Queue<Char> = LinkedList()

        var wasOrdered = true

        charArray.forEach {
            if (it == '(') {
                leftQueue.offer(it)

                if (tempRightQueue.size != 0) {
                    if (tempRightQueue.size == leftQueue.size) {
                        val loopCount = leftQueue.size
                        for (loop in 0..loopCount) {
                            resultQueue.offer(leftQueue.poll())
                        }

                        for (loop in 0..loopCount) {
                            resultQueue.offer(tempRightQueue.poll())
                        }
                    }
                }
            } else {
                if (leftQueue.size == 0) {
                    wasOrdered = false
                    tempRightQueue.offer(it)
                } else {
                    resultQueue.offer(leftQueue.poll())
                    resultQueue.offer(it)
                }
            }
        }

        val resultBuffer = StringBuffer()

        resultQueue.forEach {
            it?.let {
                resultBuffer.append(it)
            }
        }

        return if (wasOrdered) {
            p
        } else {
            resultBuffer.toString()
        }
    }
}