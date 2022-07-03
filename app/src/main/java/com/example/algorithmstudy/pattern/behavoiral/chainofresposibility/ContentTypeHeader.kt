package com.example.algorithmstudy.pattern.behavoiral.chainofresposibility

class ContentTypeHeader(val contentType: String?, var next: HandlerChain? = null) : HandlerChain {
    override fun addHeader(inputHeader: String): String =
        "$inputHeader\nContentType : $contentType".let {
            next?.addHeader(it) ?: it
        }
}
