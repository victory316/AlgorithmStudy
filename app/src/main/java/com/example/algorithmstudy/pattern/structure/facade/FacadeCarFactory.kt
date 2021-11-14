package com.example.algorithmstudy.pattern.structure.facade

import com.example.algorithmstudy.pattern.creation.factory.Car

/**
 *  퍼사드 패턴을 차용한 자동차 공장 클래스
 *
 *  - 퍼사드 패턴을 보여주기만을 위함이므로, 실제 사용 예로 따지기에는 좋지 않을 수 있음
 *  - 예 : 현재 구조는 특정 자동차와 기업들에 대한 변수 값이 고정되어 있으므로 유연하게 사용할 수 가 없음
 */
class FacadeCarFactory {
    lateinit var hyundai: Car
    lateinit var kia: Car

    fun createCar() {
        hyundai = Car.Builder("hyundai")
            .setEngine("256hp")
            .setSunroof(false)
            .setWheels(4)
            .create()

        kia = Car.Builder("kia")
            .setEngine("300hp")
            .setSunroof(true)
            .setWheels(4)
            .create()
    }

    fun printCompany() {
        println(hyundai.getCompany())
        println(kia.getCompany())
    }
}