package com.example.algorithmstudy.pattern.structure.adapter

class Adaptee : Adapter {
    override fun twiceOf(num: Int): Int {
        return num * 2
    }

    override fun halfOf(num: Int): Int {
        return num / 2
    }
}
