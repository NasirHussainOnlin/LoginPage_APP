package com.example.loginpage

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progressBar: ProgressBar = findViewById(R.id.progressBar)
        val overlayView: View = findViewById(R.id.overlayView)
        val btn1: Button = findViewById(R.id.btn1)

        btn1.setOnClickListener {
            overlayView.visibility = View.VISIBLE
            progressBar.visibility = View.VISIBLE

            // Simulate a background task
            Handler().postDelayed({
                progressBar.visibility = View.GONE
                overlayView.visibility = View.GONE

                // Show toast message
                Toast.makeText(this, "Loading completed", Toast.LENGTH_SHORT).show()
            }, 3000)
        }
    }
}


