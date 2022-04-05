package com.example.algorithmstudy.design_pattern

import com.example.algorithmstudy.pattern.structure.proxy.VirtualProxyLoader
import org.junit.Test

/**
 *  ProxyTest Pattern
 *
 *  - 사용하는 객체가 이미 생성된 경우 재사용하는 패턴
 */
class ProxyTest {

    @Test
    fun testProxy() {
        val proxyLoader = VirtualProxyLoader()

        println(proxyLoader.fetch())
        println(proxyLoader.fetch())
        println(proxyLoader.fetch() === proxyLoader.fetch())
    }
}
