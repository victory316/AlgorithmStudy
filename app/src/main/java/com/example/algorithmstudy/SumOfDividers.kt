package com.example.algorithmstudy

class SumOfDividers {

    fun solution(n: Int): Int {

        val dividerList = ArrayList<Int>()

        for (divider in 1..n) {
            if (n % divider == 0) {
//                println("$n / $divider was 0")

                dividerList.add(divider)
            }
        }


        var answer = 0

        dividerList.forEach {
            answer += it
        }

//        println(answer)

        return answer
    }
}