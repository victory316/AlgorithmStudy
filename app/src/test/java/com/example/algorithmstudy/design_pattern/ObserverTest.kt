package com.example.algorithmstudy.design_pattern

import com.example.algorithmstudy.pattern.behavoiral.observer.NewsLetter
import com.example.algorithmstudy.pattern.behavoiral.observer.NewsReader
import org.junit.Test

/**
 *  Observer Pattern test
 */
class ObserverTest {

    @Test
    fun TestObserverPattern() {
        val newsLetter = NewsLetter()
        val reader = NewsReader(newsLetter)

        newsLetter.add(reader)
        newsLetter.newestArticleUrl = "news 1"
        newsLetter.newestArticleUrl = "news 2"
        newsLetter.newestArticleUrl = "news 3"
    }
}
