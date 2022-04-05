package com.example.algorithmstudy.pattern.structure.proxy

/**
 *  권한설정이 추가되어 있는 user를 가정한 data class
 */
data class User(
    val name: String,
    var authorizeLevel: AuthorizeLevel
) {
    enum class AuthorizeLevel {
        TOP,
        MEDIUM,
        LOW
    }
}
