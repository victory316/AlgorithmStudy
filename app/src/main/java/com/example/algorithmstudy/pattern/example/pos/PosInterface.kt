package com.example.algorithmstudy.pattern.example.pos

interface PosInterface {
    fun addItem(item: Item)

    fun updateItem(item: Item)

    fun removeItem(itemId: Int)

    fun clearAllItems()

    fun publishOrder(order: Order)

    fun notifyOrderDone(orderId: Int)
}