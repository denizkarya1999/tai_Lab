package com.developer27.tailab

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page_2_Activty_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.page_2)

        // Put your name here
        val name = "Jane Doe"

        // Add an activity for
        val sayNamebuttonObj2 = findViewById<Button>(R.id.sayNamebutton)
        sayNamebuttonObj2.setOnClickListener{
            Toast.makeText(this, "You are a great developer, $name!", Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "Now returning back to main activity", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}