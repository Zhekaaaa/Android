package com.example.lesson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ArgsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_args)
        val textview9: TextView = findViewById(R.id.skip3)
        textview9.setOnClickListener {
            val intent60 = Intent(this@ArgsActivity, MainActivity::class.java)
            startActivity(intent60)
        }
    }
}