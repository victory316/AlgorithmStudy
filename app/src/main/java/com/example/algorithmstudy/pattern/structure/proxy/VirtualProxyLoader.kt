package com.example.algorithmstudy.pattern.structure.proxy

class VirtualProxyLoader : ProxyLoader {
    private val proxyData: ProxyData by lazy {
        ProxyData("PROXY DATA")
    }

    override fun fetch(): ProxyData {
        return proxyData
    }
}
