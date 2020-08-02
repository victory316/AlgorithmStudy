package com.example.algorithmstudy

/**
 *  1. 신장 트리
 *
 *  - 모든 노드가 연결되어 있으면서 트리의 속성을 만족하는 그래프
 *
 *  조건
 *
 *  - 본래 그래프의 모든 노드를 포함
 *  - 모든 노드가 서로 연결
 *  - 트리의 속성을 만족시킴(No cycle)
 *
 *  2. 최소 신장 트리(Minimum Spanning Tree)
 *
 *  - 가능한 신장 트리 중 간선의 합이 최소인 트
 *
 */
class SpanningTree {

    /**
     * 크루스칼 알고리즘
     *  1. 모든 정점을 독립적인 집합으로 만든다
     *  2. 모든 간선을 비용 기준으로 정렬하고, 비용이 작은 간선부터 양 끝의 두 정점을 비교한다
     *  3. 두 정점의 최상위 정점을 확인하고, 서로 다를 경우 두 정점을 연결한다 (사이클을 생기지 않게 하기 위함)
     *      > 사이클을 생기지 않게하기 위해 Union-Find 알고리즘을 사용
     *
     *  - 탐욕 알고리즘을 기초로 하고 있음
     */
    fun kruskal() {

    }

    fun union(nodeV: Node, nodeU: Node) {

    }

    data class Node(val index: Int, val name: String)
}