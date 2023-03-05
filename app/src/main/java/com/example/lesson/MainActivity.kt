package com.example.lesson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button3: Button = findViewById(R.id.Discovertheplatfoem)
        button3.setOnClickListener {
            val intent3 = Intent(this@MainActivity, SplashActivity::class.java)
            startActivity(intent3)
        }
        val textview10: TextView = findViewById(R.id.haveaccounts)
        textview10.setOnClickListener {
            val intent40 = Intent(this@MainActivity, SignUpActivity::class.java)
            startActivity(intent40)
        }
    }
}