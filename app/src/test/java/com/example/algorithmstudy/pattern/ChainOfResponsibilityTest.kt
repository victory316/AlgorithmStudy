package com.example.algorithmstudy.pattern

import com.example.algorithmstudy.pattern.behavoiral.chainofresposibility.AuthenticationHeader
import com.example.algorithmstudy.pattern.behavoiral.chainofresposibility.BodyPayloadHeader
import com.example.algorithmstudy.pattern.behavoiral.chainofresposibility.ContentTypeHeader
import org.junit.Test

/**
 *  ChainOfResponsibility 패턴
 *
 *  - https://medium.com/@catalinstefan/chain-of-responsibility-design-pattern-in-kotlin-b62f86be274f
 *  - 체인 형태로 이어 호출을 해야 하는 요구사항에서, 각 호출 단계별로 호출의 유효성과 오류를 확인 가능하며, 이상이 없는 경우 다음 체인까지 진행하도록 하는 패턴
 */
class ChainOfResponsibilityTest {

    @Test
    fun testChainOfResponsibility() {
        val authenticationHeader = AuthenticationHeader("111")
        val contentTypeHeader = ContentTypeHeader("json")
        val bodyPayloadHdader = BodyPayloadHeader("Body: body")

        authenticationHeader.next = contentTypeHeader
        contentTypeHeader.next = bodyPayloadHdader

        val messageWithAuth = authenticationHeader.addHeader("HEADERS WITH AUTHENTICATION")
        println(messageWithAuth)

        val messageWithoutAuth = contentTypeHeader.addHeader("HEADERS WITH AUTHENTICATION")
        println(messageWithoutAuth)
    }
}
