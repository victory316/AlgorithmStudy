package com.example.algorithmstudy.pattern.example.pos

// 1개의 주문서 단위
data class Order(
    val orderId: Int,
    val itemList: List<Item>
)