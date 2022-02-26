package com.example.lernkotlin

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import java.util.*
import java.util.concurrent.TimeUnit

class MainActivity : Activity() {

    var svetView:ImageView? = null
    var isRun: Boolean = false
    var timer: Timer? = null
    var mainImg: Int = R.drawable.svet
    var images:Array<Int> = arrayOf<Int> (
        R.drawable.svet_red,
        R.drawable.svet_yellow,
        R.drawable.svet_green
    )
    var counter:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        svetView = findViewById(R.id.svet)
    }

    fun onClickStartStop(view: View) {
        view as ImageView

        if (!isRun) {
            view.setImageResource(R.drawable.stop)
            isRun = true
            startStop()
        } else {
            timer?.cancel()
            view.setImageResource(R.drawable.start)
            svetView?.setImageResource(R.drawable.svet)
            isRun = false
            counter = 0
        }
    }

    fun startStop() {
        timer = Timer()
        timer?.schedule(object :TimerTask() {
            override fun run() {
                runOnUiThread{
                    svetView?.setImageResource(images[counter])
                    counter = if (counter == 2) 0 else counter + 1
                }
            }
        }, 0, 1000)
    }
}