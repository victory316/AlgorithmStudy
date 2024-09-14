package com.example.algorithmstudy.pattern.example.pos

sealed class Item(
    val id: Int
) {
    data class Default(
        val itemId: Int,
        val name: String
    ) : Item(itemId)

    data class Optionable(
        val itemId: Int,
        val name: String,
        val options: List<ItemOption>? = null
    ) : Item(itemId)
}
