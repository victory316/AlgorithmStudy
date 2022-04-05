package com.example.algorithmstudy.design_pattern

import com.example.algorithmstudy.pattern.structure.proxy.ProtectedProxyLoader
import com.example.algorithmstudy.pattern.structure.proxy.User
import com.example.algorithmstudy.pattern.structure.proxy.VirtualProxyLoader
import org.junit.Test

/**
 *  ProxyTest Pattern
 *
 *  - Virtual proxy : 사용하는 객체가 이미 생성된 경우 재사용하는 패턴
 *  - Protected proxy : 권한에 따라 객체 접근을 제어하는 패턴
 */
class ProxyTest {

    @Test
    fun testVirtualProxy() {
        val proxyLoader = VirtualProxyLoader()

        println(proxyLoader.fetch())
        println(proxyLoader.fetch())
        println(proxyLoader.fetch() === proxyLoader.fetch())
    }

    @Test
    fun testProtectedProxy() {
        val member = User(name = "choi", authorizeLevel = User.AuthorizeLevel.MEDIUM)
        val guest = User(name = "steve", authorizeLevel = User.AuthorizeLevel.LOW)

        val proxyLoader = ProtectedProxyLoader()

        try {
            println(proxyLoader.fetch(member))
        } catch (e: IllegalAccessException) {
            println(e.printStackTrace())
        }

        try {
            println(proxyLoader.fetch(guest))
        } catch (e: IllegalAccessException) {
            println(e.printStackTrace())
        }
    }
}
