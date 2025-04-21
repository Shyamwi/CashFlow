package com.example.foodshop

import android.content.Intent
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }

        val breakfastButton = findViewById<Button>(R.id.breakfastButton)
        breakfastButton.setOnClickListener {
            val intent = Intent(this, BreakfastActivity::class.java)
            startActivity(intent)
        }



        // Set up click listeners for navigation buttons
        findViewById<ImageButton>(R.id.btn_home).setOnClickListener {
            Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
        }

        findViewById<ImageButton>(R.id.btn_profile).setOnClickListener {
            Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show()
        }

        findViewById<ImageButton>(R.id.btn_add).setOnClickListener {
            Toast.makeText(this, "Add Recipe", Toast.LENGTH_SHORT).show()
        }

        findViewById<ImageButton>(R.id.btn_notifications).setOnClickListener {
            Toast.makeText(this, "Notifications", Toast.LENGTH_SHORT).show()
        }

        findViewById<ImageButton>(R.id.btn_settings).setOnClickListener {
            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show()
        }

        findViewById<ImageButton>(R.id.btn_add).setOnClickListener {
            val intent = Intent(this, AddRecipeActivity::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.btn_profile).setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}


