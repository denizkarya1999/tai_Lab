package com.developer27.tailab

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Handle system window insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the button and set a click listener
        val helloButton = findViewById<Button>(R.id.helloWorldButton)
        helloButton.setOnClickListener {
            Toast.makeText(this, "Hello World!", Toast.LENGTH_SHORT).show()
        }

        val denizButtonObj = findViewById<Button>(R.id.denizButton)
        denizButtonObj.setOnClickListener {
            Toast.makeText(this, "Welcome TAI Lan!", Toast.LENGTH_SHORT).show()
        }

        // Launch an intent for next button
        val nextButtonObj = findViewById<Button>(R.id.nextButton)
        nextButtonObj.setOnClickListener {
            Toast.makeText(this, "Launching page 2", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, page_2_Activty_2::class.java)
            startActivity(intent)
        }
    }
}
