package com.example.algorithmstudy.scenario

import com.example.algorithmstudy.pattern.example.pos.Item
import com.example.algorithmstudy.pattern.example.pos.PosManager
import org.junit.Test

class PosManagerTest {

    @Test
    fun `check order id count is 2 after add item`() {
        val item = Item.Default(itemId = 2, name = "Ice Americano")
        val manager = PosManager()

        manager.addItem(item)

        assert(manager.orderIdCount == 2)
    }
}