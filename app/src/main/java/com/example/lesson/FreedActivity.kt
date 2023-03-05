package com.example.lesson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FreedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_freed)
        val textview2: TextView = findViewById(R.id.skip2)
        textview2.setOnClickListener {
            val intent6 = Intent(this@FreedActivity, ArgsActivity::class.java)
            startActivity(intent6)
        }
    }
}