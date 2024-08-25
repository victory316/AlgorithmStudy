package com.example.algorithmstudy.leetcode

class Trie {

    private val savedList = mutableListOf("")

    fun insert(word: String) {
        savedList.add(word)
    }

    fun search(word: String): Boolean {
        return savedList.contains(word)
    }

    fun startsWith(prefix: String): Boolean {
        return savedList.any { it.startsWith(prefix) }
    }
}