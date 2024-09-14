package com.example.algorithmstudy.leetcode

class MinimumNumberOfArrowsToBurstBalloons {

    fun findMinArrowShots(points: Array<IntArray>): Int {
        var minArrows = points.size
        var arrowPoints = 0
        var maxCoordinate = points.maxOf { it.max() }

        while (arrowPoints <= maxCoordinate) {
            val arrowCount = points.find {
                isArrowPointBlowsBalloon(range = it, arrowPoints = arrowPoints)
            }?.size ?: 0

            if (arrowCount != 0) {
                minArrows = Math.min(minArrows, arrowCount)
            }

            arrowPoints++
        }

        return minArrows
    }

    private fun isArrowPointBlowsBalloon(range: IntArray, arrowPoints: Int): Boolean {
        println("$range | $arrowPoints")

        return (range.min() <= arrowPoints) && (range.max() >= arrowPoints)
    }
}