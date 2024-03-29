package com.example.algorithmstudy.pattern.structure.bridge

import com.example.algorithmstudy.pattern.structure.bridge.BluetoothAdapter

class LgSpeaker : BluetoothAdapter {
    override fun connect() {
        println("$this connects")
    }

    override fun disconnect() {
        println("$this disconnects")
    }

    override fun pair() {
        println("$this paired")
    }

    override fun unPair() {
        println("$this unPaired")
    }
}
