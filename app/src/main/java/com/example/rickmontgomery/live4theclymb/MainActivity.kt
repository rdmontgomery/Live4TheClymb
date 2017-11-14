package com.example.rickmontgomery.live4theclymb

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_MESSAGE = "com.example.rickmontgomery.live4theclymb.MESSAGE"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendMessage (view: View) {
        val intent = Intent(this, DisplayMessageActivity::class.java)
        val message = editText.getText().toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }
}
