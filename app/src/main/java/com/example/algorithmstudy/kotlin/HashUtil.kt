package com.example.algorithmstudy.kotlin

import java.util.*
import kotlin.collections.ArrayList

class HashUtil {

    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 0

        val clothesHash = HashMap<String, ArrayList<String>>()

        answer += clothes.size

        clothes.forEach {
            if (clothesHash[it[1]] == null) {
                clothesHash[it[1]] = ArrayList()
            }
            clothesHash[it[1]]!!.add(it[0])
        }

        var variationCount = 0

        if (clothesHash.size > 1) {
            variationCount = 1

            clothesHash.forEach {
                variationCount *= it.value.size
            }
        }

        answer += variationCount

        return answer
    }
}