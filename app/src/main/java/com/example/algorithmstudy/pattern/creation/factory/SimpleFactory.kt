package com.example.algorithmstudy.pattern.creation.factory

/**
 *  가장 단순한 Factory 패턴
 *
 *  - getInstance() 로 생성을 위임하고, 생성한 객체를 넘겨
 */
class SimpleFactory {

    fun getInstance(): SimpleFactory {
        return SimpleFactory()
    }
}