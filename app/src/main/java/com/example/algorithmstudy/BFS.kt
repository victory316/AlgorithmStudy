package com.example.algorithmstudy

import java.util.*
import kotlin.collections.ArrayList

class BFS {

    fun doBfs(input: ArrayList<Array<Char>>): CharArray {
        val resultChar: ArrayList<Char> = ArrayList()

        // Visited Queue
        val visitedQueue: Queue<Char> = LinkedList()

        // Need Visited Queue
        var needVisitedQueue: Queue<Char>

        for (inputElement in input) {
            needVisitedQueue = LinkedList()


            for (element in inputElement) {
                needVisitedQueue.add(element)
            }

            for (element in needVisitedQueue) {
                if (!visitedQueue.contains(element)) {
                    visitedQueue.offer(element)
                }
            }
        }

        return visitedQueue.toCharArray()
    }
}