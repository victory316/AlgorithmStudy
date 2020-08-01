package com.example.algorithmstudy

/**
 *  탐욕 알고리즘
 *
 *  매순간 최적이라고 생각되는 경우를 선택하는 방식으로 진행해 최종 값을 구하는 방식
*/
class Greedy {

    fun getMinimumCoins(targetValue : Int, coinList : List<Int>) : Int {
        var coinCount = 0
        var valueToSolve = targetValue

        coinList.sorted().reversed()

        coinList.forEach { coinValue ->

            val tempCoin = valueToSolve / coinValue
            coinCount += tempCoin

            valueToSolve -= tempCoin * coinValue
        }

        return coinCount
    }
}