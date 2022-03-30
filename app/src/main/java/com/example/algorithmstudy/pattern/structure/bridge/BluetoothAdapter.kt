package com.example.algorithmstudy.pattern.structure.bridge

interface BluetoothAdapter {
    fun connect()
    fun disconnect()
    fun pair()
    fun unPair()
}
