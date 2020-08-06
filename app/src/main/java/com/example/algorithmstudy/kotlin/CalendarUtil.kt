package com.example.algorithmstudy.kotlin

import java.util.*

class CalendarUtil {

    fun solution(a: Int, b: Int): String {
        val day = arrayOf("SUN","MON","TUE","WED","THU","FRI","SAT")

        Calendar.getInstance().apply {
            set(2016, a - 1, b)
        }.let {

            return day[it.get(Calendar.DAY_OF_WEEK) - 1]
        }
    }
}