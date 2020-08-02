package com.example.algorithmstudy

class HeapUtil {

    private var heap = ArrayList<Int>()
    private var insertedIndex = 0
    private var parentIdx = 0
    private var tempData = 0

    // Heap의 최초 setup
    fun setupHeap(initialInput : Int) {
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

    fun getHeap(): ArrayList<Int> {
        return heap
    }
}