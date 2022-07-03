package com.example.algorithmstudy.pattern.behavoiral.observer

class NewsLetter : IObservable {
    override val observers: ArrayList<IObserver> = ArrayList()

    var newestArticleUrl = ""
        set(value) {
            field = value
            sendUpdateEvent()
        }
}
