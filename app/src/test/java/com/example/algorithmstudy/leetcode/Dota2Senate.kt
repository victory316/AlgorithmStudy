package com.example.algorithmstudy.leetcode

import java.util.LinkedList
import java.util.Queue

class Dota2Senate {
    fun predictPartyVictory(senate: String): String {
        val senates = senate.toCharArray().toMutableList()
        val senateQueue: Queue<Char> = LinkedList()

        senate.toCharArray().forEach {
            senateQueue.offer(it)
        }

        while (senateQueue.isNotEmpty()) {
            val currentSenator = senateQueue.poll()
            if (currentSenator == 'R') {
                senates.remove('D')
                senateQueue.remove('D')
            } else {
                senates.remove('R')
                senateQueue.remove('R')
            }
        }

        val R = senates.count {
            it == 'R'
        }

        val D = senates.count {
            it == 'D'
        }

        return if (R > D) {
            "Radiant"
        } else {
            "Dire"
        }
    }
}