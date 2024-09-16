package com.example.algorithmstudy.leetcode

class Keypads {

    var answer = 0
    val mutable = mutableMapOf(
        1 to mutableListOf('2','4')
    )
    val board = Array(5) {
        arrayOf("2","2")
    }

    init {
        board.get(0).get(2)
        val startPos = board.find { it.find { "3" == it }?.isNotEmpty() }

        val a = mutable.filter { it.value.size == 0 }.keys

        if (a != null) {
            mutable[a.first()]?.add('e')
        }
        mutable.keys[1]

        a.entries.fin

        a.keys.
        val key = mutable.filter { it.value.size == 2 }.values.g
        key.values.
        val it = mutable.toList().find { it.second.contains('3') }.second.getOrElse(3,

            )
        mutable.forEach {keypadMap.filter { it.value.size == 2}?.getOrNull(2)
            it.value
        }
        val index = it?.second?.indexOf('2')

        mutable.values.c

        "dsklfnalfklnkfdsa".toCharArray().sorted()

        mutableListOf<>()
        val array = intArrayOf(2,4,5) + intArrayOf(0)
        val new = IntArray(5)
        array.

        new.plus(array.copyOfRange(0,3))
        println(ne)

        answer += 0
    }
}