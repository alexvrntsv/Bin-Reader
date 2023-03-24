package com.example.binreader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binInput : EditText = findViewById(R.id.binNumber)
        val searchButton : Button = findViewById(R.id.searchButton)

    }
}