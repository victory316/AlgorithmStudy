package com.example.algorithmstudy.pattern.example.pos

class PosManager : PosInterface {

    private var orderIdCount: Int = 1

    private var currentOrderRequest: OrderRequest? = null

    override fun addItem(item: Item) {
        if (currentOrderRequest == null) {
            currentOrderRequest = OrderRequest(
                orderId = orderIdCount++,
                itemList = listOf(item)
            )
        } else {
            currentOrderRequest?.run {
                currentOrderRequest = copy(
                    itemList = itemList.toMutableList().apply {
                        add(item)
                    }.toList()
                )
            }
        }
    }

    override fun updateItem(item: Item) {
        currentOrderRequest ?: return

        val currentItemIndex = currentOrderRequest?.itemList
            ?.indexOfFirst { it.id == item.id } ?: return

        currentOrderRequest?.itemList?.toMutableList()?.set(currentItemIndex, item)
    }

    override fun removeItem(itemId: Int) {
        currentOrderRequest ?: return

        currentOrderRequest?.run {
            val prevItemId = itemList.indexOfFirst { it.id == itemId }

            if (prevItemId == -1) return@run

            currentOrderRequest = copy(
                itemList = itemList.toMutableList().apply {

                }.toList()
            )
        }
    }

    override fun clearAllItems() {
        currentOrderRequest?.run {
            currentOrderRequest = copy(
                itemList = emptyList()
            )
        }
    }

    override fun publishOrder() {
        // Do publishing to server and customer
        currentOrderRequest = null
    }
}