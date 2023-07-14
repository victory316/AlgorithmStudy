package com.example.algorithmstudy.pattern

import com.example.algorithmstudy.pattern.behavoiral.command.*
import org.junit.Test

/**
 *  Command Pattern
 *
 *  - 커맨터 패턴은 Command interface, invoker class, receiver class 로 구성된다.
 *  - Command Interface는 execute function을 갖는다.
 *  - Receiver에는 실제 수행해야 할 기능을 정의하며, invoker class가 Receiver의 function을 invoke 하는 역할을 맡게 된다.
 *
 */
class CommandTest {

    @Test
    fun testCommand() {
        // ConsumerWeapon의 구현체 : Receiver
        // button: Invoker

        val cw = UniversalFiringSystem().getActiveWeapon()
        val fireCommand = FireCommand(cw)
        val button = Button(fireCommand)
        button.click()

        val weaponList = listOf(CruiseMissile(), GrenadeLauncher())
        val reloadAllCommand = ReloadAllCommand(weaponList)
        val reloadButton = Button(reloadAllCommand)
        reloadButton.click()
    }
}
