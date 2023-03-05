package com.example.lesson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class TrueActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_true)
        val textview1: TextView = findViewById(R.id.skip1)
        textview1.setOnClickListener {
            val intent5 = Intent(this@TrueActivity, FreedActivity::class.java)
            startActivity(intent5)
        }

    }
}