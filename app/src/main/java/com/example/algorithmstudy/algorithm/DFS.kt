package com.example.algorithmstudy.algorithm

import java.util.*
import kotlin.collections.ArrayList

class DFS {

    /**
     *  BFS와의 차이점은 BFS는 Queue 두 개를 이용한다는 것이고 DFS는 Queue와 Stack 1개씩을 이용한다는 점.
     *
     */

    fun doDFS(input: ArrayList<Array<Char>>): CharArray {

        // Visited Queue
        val visitedQueue: Queue<Char> = LinkedList()

        // Need Visited Stack
        var needVisitedStack: Stack<Char> = Stack()

        while (visitedQueue.size != input.size) {
            // 최초 노드 추가
            if (visitedQueue.size == 0) {
                visitedQueue.offer(input[0][0])

                for (index in 1 until input[0].size) {
                    needVisitedStack.add(input[0][index])
                }
            } else {

                // Visited stack 검사
                val popElement = needVisitedStack.pop()

                if (!visitedQueue.contains(popElement)) {

                    // visitedQueue에 없을 경우 visitedQueue에 추가 및 needVisitStack에 관련 노드 추가
                    visitedQueue.add(popElement)

                    for (elementList in input) {
                        if (elementList[0] == popElement) {
                            needVisitedStack.addAll(elementList)
                        }
                    }
                } else {
                    needVisitedStack.pop()
                }

                println()
            }
        }

        return visitedQueue.toCharArray()
    }
}