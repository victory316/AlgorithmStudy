package com.example.algorithmstudy.leetcode

class LetterCombinationsOfAPhoneNumber {

    fun letterCombinations(digits: String): List<String> {
        val resultMap = mutableListOf("")

        val lettersMap = mapOf(
            "1" to listOf(),
            "2" to listOf("a","b","c"),
            "3" to listOf("d","e","f"),
            "4" to listOf("g","h","i"),
            "5" to listOf("j","k","l"),
            "6" to listOf("m","n","o"),
            "7" to listOf("p","q","r","s"),
            "8" to listOf("t","u","v"),
            "9" to listOf("w","x","y","z"),
        )
        return listOf()
    }
}