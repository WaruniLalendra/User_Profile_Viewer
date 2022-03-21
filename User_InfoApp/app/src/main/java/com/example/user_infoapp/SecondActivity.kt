package com.example.user_infoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val buttonSecondActivity = findViewById<Button>(R.id.button_second_activity)
        val textViewSecondActivity = findViewById<TextView>(R.id.textview_second_activity)

        buttonSecondActivity.setOnClickListener(){
            textViewSecondActivity.text = "Interesting!"
        }
    }
}