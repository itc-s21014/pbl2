package com.example.pbl

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pbl.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity(){
    private lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signupregi.setOnClickListener {
            val intent = Intent()
            startActivity(intent)
        }
    }
}