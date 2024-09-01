package com.example.algorithmstudy.leetcode

class SuggestedProducts {
    fun suggestedProducts(products: Array<String>, searchWord: String): List<List<String>> {
        var currentSearchKeyword = ""

        return buildList {
            searchWord.forEach {
                currentSearchKeyword += it
                val filtered = products.filter {
                        it.startsWith(currentSearchKeyword)
                    }.sorted()

                add(filtered.subList(0, Math.min(filtered.size, 3)))
            }
        }
    }
}