package com.example.algorithmstudy

/**
 *  BackTracking
 *
 *  제약조건 만족 문제를 해결하기 위한 전략. 각 후보군을 DFS 방식으로 체크.
 *  구현할 수 있는 모든 경우의 수를 상태 공간 트리에 넣고 판단함.
 *
 *
 *  - Promising : 해당 루트가 조건에 맞는지 확인
 *  - Pruning : 해당 루트가 조건에 맞지 않으면 다른 루트로 돌아서서 탐색시간을 절약하는 기
 */
class Backtracking {

    fun dfs(N : Int, current_row: Int, current_candidate: ArrayList<Int>, final_result: ArrayList<Int>) {
        if (current_row == N) {
            final_result.addAll(current_candidate)
        }
    }

    fun solveNQueens(): ArrayList<Int> {
        val result = ArrayList<Int>()

        return result
    }
}