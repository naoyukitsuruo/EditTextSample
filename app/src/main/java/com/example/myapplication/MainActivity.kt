package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editText = findViewById<EditText>(R.id.edit_text)
        var inputText = editText.editableText

        Log.d("aaaaaaaaaaaaaaaa" , "${inputText}")

        val nextButton = findViewById<Button>(R.id.next_button)

        nextButton.setOnClickListener {
            if(editText.text != null){
                val intent = Intent(this, NextActivity::class.java)
                intent.putExtra("INPUT_TEXT",inputText.toString())
                startActivity(intent)
            }
        }
    }
}