package com.example.algorithmstudy.pattern.creation.builder

class MailBuilder(private val to: String) {
    private var mail = Mail(to)

    fun title(title: String): MailBuilder {
        mail.title = title
        return this
    }

    fun build(): Mail {
        return mail
    }
}

data class Mail(
    var to: String,
    var title: String = "",
    var message: String = ""
)