package com.example.algorithmstudy

import java.util.*

class QueueUtil {
    fun solution(priorities: IntArray, location: Int): Int {
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
}