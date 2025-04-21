package com.example.foodshop

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Set up back button
        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            finish() // Close this activity and return to the previous one
        }

        // Set up Edit Profile Picture button
        val editPictureButton = findViewById<ImageButton>(R.id.btnEditPicture)
        editPictureButton.setOnClickListener {
            Toast.makeText(this, "Change profile picture functionality would be implemented here", Toast.LENGTH_SHORT).show()
        }

        // Set up Save Profile button
        val saveButton = findViewById<Button>(R.id.btnSaveProfile)
        saveButton.setOnClickListener {
            Toast.makeText(this, "Profile saved successfully!", Toast.LENGTH_SHORT).show()
            finish() // Return to previous screen after saving
        }
    }
}