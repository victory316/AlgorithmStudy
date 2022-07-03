package com.example.algorithmstudy.pattern.behavoiral.observer

class NewsReader(private var newsLetter: NewsLetter) : IObserver {
    override fun update() {
        println("New article : ${newsLetter.newestArticleUrl}")
    }
}
