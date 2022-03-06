package com.example.algorithmstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.algorithmstudy.pattern.creation.builder.MailBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buildMail()
    }

    private fun buildMail() {
        MailBuilder("Bill gates")
            .title("Hi bill!")
            .build().also {
                Log.d("patternTest", "Mail was built : $it")
            }
    }
}
