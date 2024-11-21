package com.example.android_lab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.edit_text)
        val textView = findViewById<TextView>(R.id.text_view)

        editText.setOnEditorActionListener{ _, _, _ ->
            var input = editText.text.toString()
            var output = countLatinLetter(input)
            textView.text = output.toString()
            true
        }
    }

    fun countLatinLetter(input: String): Int{
        val latinRegex = Regex("[a-zA-Z]")
        val latinChars = latinRegex.findAll(input)
        return latinChars.count()
    }
}