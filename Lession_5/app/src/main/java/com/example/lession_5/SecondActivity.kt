package com.example.lession_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var textView = findViewById<TextView>(R.id.textView2)
        var i = intent

        if (i != null) {
            var s: String = i.getStringExtra("name") + " " + i.getStringExtra("lastname")
            textView.setText(s)
        }
    }
}