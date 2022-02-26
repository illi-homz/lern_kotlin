package com.example.lession_5

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToSecondScreen(view: View) {
        val intent: Intent = Intent(this, SecondActivity::class.java).apply {
            putExtra("name", "Ilya")
        }
        intent.putExtra("lastname", "Gomza")
        startActivity(intent)
    }
}