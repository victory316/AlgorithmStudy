package com.example.algorithmstudy.algorithm

/**
 *  탐욕 알고리즘
 *
 *  매순간 최적이라고 생각되는 경우를 선택하는 방식으로 진행해 최종 값을 구하는 방식
 */
class Greedy {

    fun getMinimumCoins(targetValue: Int, coinList: List<Int>): Int {
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

    // product 0 : weight | 1 : value
    // 전달받은 물건들의 무게와 가치를 통해 배낭이 가장 큰 가치를 가지도록 물건을 넣는 문제
    fun fractionalNapsack(productList: List<List<Int>>, inputCapacity: Int): ArrayList<Pair<List<Int>, Double>> {

        val sortedList = productList
            .sortedBy { product -> product[1].toDouble() / product[0].toDouble() }.reversed()

        val resultList = ArrayList<Pair<List<Int>, Double>>()

        var capacity = inputCapacity
        var tempWeight = 0.0

        sortedList.forEach { product ->

            // 아직 넣을 수 있다
            if (capacity - product[0] > 0) {
                capacity -= product[0]

                resultList.add(Pair(product, 1.0))
            } else {
                tempWeight = capacity.toDouble() / product[0].toDouble()
                capacity -= (tempWeight * product[0]).toInt()
                resultList.add(Pair(product, tempWeight))
            }
        }

        return resultList
    }
}