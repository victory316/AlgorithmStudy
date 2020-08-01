package com.example.algorithmstudy

import org.junit.Test

class DijstraTest {

    @Test
    fun testDijstra() {

        val myGraph = HashMap<Char, List<Dijkstra.Node>>()

        myGraph['A'] = listOf(Dijkstra.Node(8, 'B'), Dijkstra.Node(1, 'C'), Dijkstra.Node(2, 'D'))
        myGraph['B'] = emptyList()
        myGraph['C'] = listOf(Dijkstra.Node(5, 'B'), Dijkstra.Node(2, 'D'))
        myGraph['D'] = listOf(Dijkstra.Node(3, 'E'), Dijkstra.Node(5, 'F'))
        myGraph['E'] = listOf(Dijkstra.Node(1, 'F'))
        myGraph['F'] = listOf(Dijkstra.Node(5, 'A'))


        Dijkstra().doDijkstra(myGraph, Dijkstra.Node(0, 'A')).forEach {
            println(it)
        }
    }
}