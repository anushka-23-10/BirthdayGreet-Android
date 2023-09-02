package com.example.birthdaywish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birthdaywish.databinding.ActivityBirthdayGreetMessageBinding

class BirthdayGreetMessage : AppCompatActivity() {
    private lateinit var binding: ActivityBirthdayGreetMessageBinding
    companion object{
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirthdayGreetMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val name = intent.getStringExtra(NAME_EXTRA)

         binding.birthdayMessageDisplay.text = "Happy Birthday\n$name!"
    }
}