package com.example.algorithmstudy

import java.util.*
import kotlin.collections.ArrayList

class DFS {

    /**
     *  BFS와의 차이점은 BFS는 Queue 두 개를 이용한다는 것이고 DFS는 Queue와 Stack 1개씩을 이용한다는 점.
     *
     */

    fun doDFS(input: ArrayList<Array<Char>>): CharArray {
        val resultChar: ArrayList<Char> = ArrayList()

        // Visited Queue
        val visitedQueue: Queue<Char> = LinkedList()

        // Need Visited Stack
        var needVisitedStack: Stack<Char> = Stack()

        for (inputElement in input) {

            // 최초 노드 추가
            if (visitedQueue.size == 0) {
                visitedQueue.offer(inputElement[0])

                for (index in 1 until inputElement.size) {

                    needVisitedStack.add(inputElement[index])
                }
            } else {

                val popElement = needVisitedStack.pop()

                if (!visitedQueue.contains(popElement)) {
                    // visitedQueue에 없다면
                    visitedQueue.add(popElement)
                    for (elementList in input) {
                        if (elementList[0] == popElement) {
                            needVisitedStack.addAll(elementList)
                        }
                    }
                } else {
                    needVisitedStack.pop()
                }

                println("visited queue")
                for (element in visitedQueue) {
                    print("$element ")
                }

                println()

                println("need visited stack")
                for (element in needVisitedStack) {
                    print("$element ")
                }

                println()

            }
        }

        return visitedQueue.toCharArray()
    }
}