package com.example.algorithmstudy.pattern.structure.facade

/**
 *  최소 지식의 원칙!
 *
 *  - 자기 자신만의 객체 사용
 *  - 메서드에 전달된 매게변수 사용
 *  - 메서드에서 생성된 객체 사용
 *  - 객체에 속하는 메서드 사용
 */
class Car {

    // 메서드에서 생성된 객체 사용
    private lateinit var engine: Engine

    constructor(engine: Engine) {
        this.engine = engine
    }

    fun start(key: Key) {

        // 메서드에서 생성된 객체의 사용
        val doors = Doors()

        // 매개변수로 전달된 객체의 메서드 사용
        val authorized = key.turns()

        if (authorized) {

            // 객채에 속하는 메서드 사용
            engine.start()

            // 객체 내에 있는 메서드의 사용
            updateDashboardDisplay()

            // 객체에 속하는 메서드 사용
            doors.lock()
        }
    }

    fun updateDashboardDisplay() {

    }

    inner class Engine {
        fun start() {}
    }

    inner class Doors {
        fun lock() {}
    }
}