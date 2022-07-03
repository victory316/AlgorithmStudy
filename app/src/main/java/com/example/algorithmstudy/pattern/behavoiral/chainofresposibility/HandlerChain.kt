package com.example.algorithmstudy.pattern.behavoiral.chainofresposibility

interface HandlerChain {
    fun addHeader(inputHeader: String): String
}
