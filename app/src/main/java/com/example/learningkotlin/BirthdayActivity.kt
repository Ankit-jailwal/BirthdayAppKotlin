package com.example.learningkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_birthday.*

class BirthdayActivity : AppCompatActivity() {

    // Useful to create static variable between multiple activities
    companion object{
         const val Name_Val = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday)

        val name = intent.getStringExtra(Name_Val)

        Log.d("Nameeee", Name_Val);
        //Using .text
//        birthdayGreeting.text = "Happy Birthday $name!"

        // Using setText
          birthdayGreeting.setText("Happy Birthday\n$name")
    }
}