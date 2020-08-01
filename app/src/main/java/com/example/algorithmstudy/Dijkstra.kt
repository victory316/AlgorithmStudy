package com.example.algorithmstudy

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.*
import kotlin.Comparator
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class Dijkstra {

    /**
     *  우선순위 큐를 활용한 다익스트라 알고리즘
     *
     *   - 우선순위 큐는 MinHeap 방식을 사용해 현재 가장 짧은 거리에 있는 노드를 먼저 꺼내게 됨.
     *
     *   1. 첫 정점을 기준으로 배열을 선언해 첫 정점에서 각 정점까지의 거리를 저장
     *   - 초기에는 첫 정점의 거리는 0, 나머지는 무한대로 저장
     *   - 우선순위 큐에 (첫 정점, 거리 0)만 먼저 넣음.
     *
     *   2. 우선순위 큐에서 노드를 꺼냄
     *   - 처음에는 첫 정점만 저장되어 있으므로 첫 정점이 꺼내짐
     *   - 첫 정점과 인접한 노드들간의 거리와 현재 배열에 저장된 노드들간의 거리를 비교
     *   - 배열에 저장된 거리보다 노드로의 거리가 짧을 경우 배열에 해당 노드로의 거리를 업데이트
     *   - 배열에 해당 노드의 거리가 업데이트 된 경우 우선순위 큐에 넣는다.
     *   - BFS와 유사하게 첫 정점에 인접해 있는 노드들을 순차적으로 방문하게 됨.
     *
     *   3. 2번의 과정을 우선순위 큐에 꺼낼 노드가 없을 때까지 반복.
     *
     */

    @RequiresApi(Build.VERSION_CODES.N)
    fun testMinHeap() {
        val testMinQueue = PriorityQueue<Node>(CustomComparator)

        testMinQueue.add(Node(2, 'A'))
        testMinQueue.add(Node(5, 'B'))
        testMinQueue.add(Node(1, 'C'))
        testMinQueue.add(Node(7, 'D'))

        testMinQueue.forEach {
            println(it)
        }

        for (index in 0..testMinQueue.size) {
            println(testMinQueue.poll())
        }
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun setDijkstraGraph() {
        val myGraph = HashMap<Char, List<Node>>()

        myGraph['A'] = listOf(Node(8, 'B'), Node(1, 'C'), Node(2, 'D'))
        myGraph['B'] = emptyList()
        myGraph['C'] = listOf(Node(5, 'B'), Node(2, 'D'))
        myGraph['D'] = listOf(Node(3, 'E'), Node(5, 'F'))
        myGraph['E'] = listOf(Node(1, 'F'))
        myGraph['F'] = listOf(Node(5, 'A'))

    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun doDijkstra(myGraph: HashMap<Char, List<Node>>, start: Node): HashMap<Char, Int> {
        val distances = HashMap<Char, Int>()

        // 최초 거리저장 배열 세팅
        for (indices in myGraph) {
            distances[indices.key] = 99999999
        }

        distances[start.name] = 0

        distances.forEach {
            println(it)
        }

        // 우선순위 큐 설정
        val priorityQueue = PriorityQueue<Node>(CustomComparator)

        priorityQueue.offer(start)

        while (priorityQueue.isNotEmpty()) {
            val currentItem = priorityQueue.poll()!!
            var distance = 0

            if (distances[currentItem.name]!! < currentItem.distance) continue

            for (graphItem in myGraph[currentItem.name]!!) {
                distance = currentItem.distance + graphItem.distance

                println("current : ${graphItem} | distance : $distance | current item distance : ${distances[currentItem.name]}")

                if (distance < distances[graphItem.name]!!) {
                    distances[graphItem.name] = distance

                    println("after loop ")
                    println()

                    distances.forEach {
                        println(it)
                    }

                    priorityQueue.offer(Node(distance, graphItem.name))
                    println("offering : ${Node(distance, graphItem.name)}")
                    println()
                    priorityQueue.forEach {
                        println(it)
                    }
                }
            }
        }

        return distances
    }

    data class Node(val distance: Int, val name: Char)

    class CustomComparator {
        companion object : Comparator<Node> {
            override fun compare(o1: Node, o2: Node): Int =
                when {
                    o1.distance != o2.distance -> o1.distance - o2.distance
                    else -> 0
                }
        }
    }
}