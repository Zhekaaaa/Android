package com.example.lesson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val textview: TextView = findViewById(R.id.textView)
        textview.setOnClickListener {
            val intent4 = Intent(this@SplashActivity, TrueActivity::class.java)
            startActivity(intent4)
        }
    }
}