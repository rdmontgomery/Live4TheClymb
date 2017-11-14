package com.example.rickmontgomery.live4theclymb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_display_message.*


class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val intent = getIntent()
        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
        textView.text = message
    }
}
