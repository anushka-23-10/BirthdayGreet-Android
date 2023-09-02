package com.example.birthdaywish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.birthdaywish.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun createCard(view: View) {
        val name = binding.inputName.editableText.toString()
        val intent =Intent(this, BirthdayGreetMessage:: class.java)

        intent.putExtra(BirthdayGreetMessage.NAME_EXTRA, name)
        startActivity(intent)
    }
}