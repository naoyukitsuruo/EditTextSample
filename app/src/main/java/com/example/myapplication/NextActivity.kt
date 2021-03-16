package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NextActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        var getText = findViewById<TextView>(R.id.get_text)
        val intentText = intent.getStringExtra("INPUT_TEXT")

        getText.text = intentText

        val returnButton = findViewById<Button>(R.id.return_button)
        returnButton.setOnClickListener {
            finish()
        }
    }
}
