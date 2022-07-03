package com.example.algorithmstudy.pattern.behavoiral.chainofresposibility

class BodyPayloadHeader(val body: String?, var next: HandlerChain? = null) : HandlerChain {
    override fun addHeader(inputHeader: String): String =
        "$inputHeader\nContentType : $body".let {
            next?.addHeader(it) ?: it
        }
}
