package com.example.pbl

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pbl.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity () {
    private lateinit var binding: ActivityRegisterbinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
}