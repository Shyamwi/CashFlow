package com.example.foodshop

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AddRecipeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_recipe)

        // Set up back button
        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            finish() // Close this activity and return to the previous one
        }

        // Set up Add Photo button
        val addPhotoButton = findViewById<Button>(R.id.btnAddPhoto)
        addPhotoButton.setOnClickListener {
            Toast.makeText(this, "Photo functionality would be implemented here", Toast.LENGTH_SHORT).show()
        }

        // Set up Save Recipe button
        val saveButton = findViewById<Button>(R.id.btnSaveRecipe)
        saveButton.setOnClickListener {
            Toast.makeText(this, "Recipe saved successfully!", Toast.LENGTH_SHORT).show()
            finish() // Return to previous screen after saving
        }
    }
}