package com.example.algorithmstudy.pattern.behavoiral.chainofresposibility

class AuthenticationHeader(val token: String?, var next: HandlerChain? = null) : HandlerChain {
    override fun addHeader(inputHeader: String): String =
        "$inputHeader\nAuthorization : $token".let {
            next?.addHeader(it) ?: it
        }
}
