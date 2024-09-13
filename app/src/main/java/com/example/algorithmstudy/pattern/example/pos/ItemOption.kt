package com.example.algorithmstudy.pattern.example.pos

sealed class ItemOption(
    val id: Int
) {
    data class Memo(
        val memoId: Int,
        val memos: String
    ) : ItemOption(
        id = memoId
    )

    data class Quantity(
        val countableId: Int,
        val name: String,
        val quantity: Int
    ) : ItemOption(id = countableId)
}
