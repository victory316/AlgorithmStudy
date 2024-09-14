package com.example.algorithmstudy.leetcode

class GroupAnagrams {

    var result = mutableMapOf<String, List<String>>()

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        strs.forEach { str ->
            val key = str.toCharArray().sorted().toString()
            if (result[key].isNullOrEmpty()) {
                result[key] = mutableListOf(str)
            } else {
                result[key] = result[key]!!.toMutableList().apply {
                    add(str)
                }
            }
        }
        return result.map { it.value }
    }
}