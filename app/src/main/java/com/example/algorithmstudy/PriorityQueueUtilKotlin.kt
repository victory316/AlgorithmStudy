package com.example.algorithmstudy

import java.util.*

class PriorityQueueUtilKotlin {

    fun solution(operations: Array<String>): IntArray {
        var answer = intArrayOf()
        val priorityQueue = PriorityQueue<Int>()

        operations.forEach {
            val operation = it.split(' ')

            when (operation[0]) {
                "I" -> {
                    priorityQueue.offer(operation[1].toInt())
                }
                "D" -> {
                    when (operation[1].toInt()) {
                        1 -> { priorityQueue.remove(priorityQueue.max())}
                        -1 -> { priorityQueue.remove(priorityQueue.min())}
                    }
                }
            }
        }

        return if (priorityQueue.size == 0) {
            intArrayOf(0, 0)
        } else {
            intArrayOf(priorityQueue.max()!!, priorityQueue.min()!!)
        }
    }
}