package com.example.lession_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var itemsList = ArrayList<String>()
        itemsList.add("1")
        itemsList.add("2")
        itemsList.add("3")
        itemsList.add("4")
        itemsList.add("5")
        itemsList.add("6")
        itemsList.add("7")

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            itemsList
        )
        listView.adapter = adapter

        listView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(
                this,
                "Pressed: ${itemsList[i]}",
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}