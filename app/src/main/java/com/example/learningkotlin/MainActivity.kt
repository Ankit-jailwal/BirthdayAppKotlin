package com.example.learningkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {
        val name = nameInput.editableText.toString()
        // Used for navigation in kotlin
        val intent = Intent(this, BirthdayActivity::class.java)

        intent.putExtra(BirthdayActivity.Name_Val,name)
        startActivity(intent)

//        val name = nameInput.editableText.toString()
//        Toast.makeText(this, "Happy Birthday $name", Toast.LENGTH_SHORT).show()
    }
}