package com.example.srn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.KeyEventDispatcher


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val irselpro: Button = findViewById(R.id.butini)
        irselpro.setOnClickListener {
            val intent = Intent(this,Selpro::class.java)
            startActivity(intent)
        }
    }

}