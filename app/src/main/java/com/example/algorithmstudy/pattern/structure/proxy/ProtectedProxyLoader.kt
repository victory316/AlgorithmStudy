package com.example.algorithmstudy.pattern.structure.proxy

class ProtectedProxyLoader : ProtectedProxyInterface {
    private val proxyData: ProxyData by lazy {
        ProxyData("PROXY DATA")
    }

    // fetch 가능한 수준을 MEDIUM 이상으로 설정
    override fun fetch(user: User): ProxyData {
        return when (user.authorizeLevel) {
            User.AuthorizeLevel.TOP -> proxyData
            User.AuthorizeLevel.MEDIUM -> proxyData
            User.AuthorizeLevel.LOW -> throw IllegalAccessException("Unauthorized access.")
        }
    }
}
