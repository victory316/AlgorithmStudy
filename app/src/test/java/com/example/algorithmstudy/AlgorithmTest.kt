package com.example.algorithmstudy

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class AlgorithmTest {

    @Test
    fun testBFS() {
        val bfs = BFS()

        val inputArray: ArrayList<Array<Char>> = arrayListOf(
            arrayOf('A', 'B', 'C'),
            arrayOf('B', 'A', 'D'),
            arrayOf('C', 'A', 'G', 'H', 'I'),
            arrayOf('D', 'B', 'E', 'F'),
            arrayOf('E', 'D'),
            arrayOf('F', 'D'),
            arrayOf('G', 'C'),
            arrayOf('H', 'C'),
            arrayOf('I', 'C', 'J'),
            arrayOf('J', 'I')
        )

        bfs.doBfs(inputArray)
    }

    @Test
    fun testDFS() {
        val dfs = DFS()

        val inputArray: ArrayList<Array<Char>> = arrayListOf(
            arrayOf('A', 'B', 'C'),
            arrayOf('B', 'A', 'D'),
            arrayOf('C', 'A', 'G', 'H', 'I'),
            arrayOf('D', 'B', 'E', 'F'),
            arrayOf('E', 'D'),
            arrayOf('F', 'D'),
            arrayOf('G', 'C'),
            arrayOf('H', 'C'),
            arrayOf('I', 'C', 'J'),
            arrayOf('J', 'I')
        )

        dfs.doDFS(inputArray)
    }
}
