package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val actionBtn = findViewById<Button>(R.id.readingbtn)
        actionBtn.setOnClickListener(){
            val Intent = Intent(this, MainPage::class.java)
            startActivity(Intent)
            finish()}
    }
}