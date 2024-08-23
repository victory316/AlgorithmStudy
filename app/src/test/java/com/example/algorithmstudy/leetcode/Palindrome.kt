package com.example.algorithmstudy.leetcode

class Palindrome {
    fun isPalindrome(x: Int): Boolean {
        val original = x.toString().toCharArray().map { it }.toList()
        val reverse = x.toString().toCharArray().map { it }.toList().asReversed()
        var isPalindrome = true

        original.forEachIndexed { a, b ->
            if (b != reverse[a] && isPalindrome) {
                isPalindrome = false
            }
        }

        return isPalindrome
    }
}