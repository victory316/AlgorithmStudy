package com.example.algorithmstudy

import java.util.*

/**
 *  Heap
 *
 *  1. 노드들은 크고 작음에 상관없이 왼쪽 노드들부터 채운다.
 *  2. 채운 후 부모 노드와 자식 노드를 비교해 큰 노드를 부모로 올린다.
 *  3. 힙의 루트 노드를 pop한 경우 가장 마지막에 add한 노드를 루트로 올린다.
 *
 *  - heap 구현을 위해 최상단에 존재하는 None은 현재 0으로 대체되어 있음.
 *
 *  노드의 인덱스 알기
 *
 *  - 부모 : 자식 노드 인덱스 / 2
 *  - 왼쪽 자식 노드 : 부모 노드 인덱스 * 2
 *  - 오른쪽 자식 노드 : 부모 노드 인덱스 * 2 + 1
 */
class HeapUtil {

    private var heap = ArrayList<Int>()
    private var insertedIndex = 0
    private var parentIdx = 0
    private var tempData = 0

    // Heap의 최초 setup
    fun setupHeap(initialInput: Int) {
        heap = ArrayList()

        insert(initialInput)
    }

    fun insert(input: Int) {
        if (heap.size == 0) {
            heap.add(0)
            heap.add(input)

            return
        }

        heap.add(input)

        insertedIndex = heap.size - 1

        while (moveUp(insertedIndex)) {
            parentIdx = insertedIndex / 2

            println("parent : $parentIdx | inserted : ${insertedIndex}")

            tempData = heap[parentIdx]
            heap[parentIdx] = heap[insertedIndex]
            heap[insertedIndex] = tempData
            insertedIndex = parentIdx
        }
    }

    private fun moveUp(insertedIndex: Int): Boolean {
        if (insertedIndex <= 1) {
            return false
        }

        parentIdx = insertedIndex / 2

        return heap[parentIdx] < heap[insertedIndex]
    }

    private fun moveDown(popIndex: Int): Boolean {
        val leftNodeIndex = popIndex * 2
        val rightNodeIndex = popIndex * 2 + 1

        // 왼쪽 자식노드 확인
        if (heap.size <= leftNodeIndex) {
            return false
        }

        if (heap.size <= rightNodeIndex) {
            return heap[popIndex] < heap[rightNodeIndex]
        }

        // 좌 우 Node 비교
        return if (heap[leftNodeIndex] > heap[rightNodeIndex]) {
            heap[popIndex] < heap[leftNodeIndex]
        } else {
            heap[popIndex] < heap[rightNodeIndex]
        }
    }

    fun pop(): Int {
        if (heap.size <= 1) return 0

        val returnData = heap[1]

        // 가장 마지막에 추가된 데이터를 root로 올림
        heap[1] = heap[heap.size - 1]
        heap.removeAt(heap.size - 1)

        var popIndex = 1

        while (moveDown(popIndex)) {
            val leftPopIndex = popIndex * 2
            val rightPopIndex = popIndex * 2 + 1

            // 오른쪽 노드 없을때
            if (rightPopIndex >= heap.size) {
                if (heap[popIndex] < heap[leftPopIndex]) {
                    Collections.swap(heap, leftPopIndex, popIndex)
                }

                popIndex = leftPopIndex
            } else {
                if (heap[leftPopIndex] > heap[rightPopIndex]) {
                    if (heap[popIndex] < heap[leftPopIndex]) {
                        Collections.swap(heap, leftPopIndex, popIndex)
                    }

                    popIndex = leftPopIndex
                } else {
                    if (heap[popIndex] < heap[rightPopIndex]) {
                        Collections.swap(heap, rightPopIndex, popIndex)
                    }

                    popIndex = rightPopIndex
                }
            }
        }

        return returnData
    }

    fun getHeap(): ArrayList<Int> {
        return heap
    }
}