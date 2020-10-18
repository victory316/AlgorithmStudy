package com.example.algorithmstudy.pattern.creation

/**
 *  동적 생성이 가능한 Factory로 newInstance의 파라미터에 따라 다른 객체를 생성해 반환.
 */
class DynamicFactory {

    fun getInstance(type: String): Any {
        return when (type) {
            "Korean" -> Korean()
            "English" -> English()
            else -> Korean()
        }
    }

    class Korean() {
        fun getLanuage(): String {
            return "korean"
        }
    }

    class English() {
        fun getLanuage(): String {
            return "english"
        }
    }
}