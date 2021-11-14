package com.example.algorithmstudy.pattern.creation.singleton

/**
 *  ref : https://stackoverflow.com/questions/56825097/synchronized-singleton-in-kotlin
 */
class CustomSingleton private constructor() {
    companion object {
        val instance: CustomSingleton by lazy { CustomSingleton() }
    }
}