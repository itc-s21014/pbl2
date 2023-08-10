package com.example.pbl

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pbl.databinding.ActivitySettingFinishedBinding

class SettingFinishedActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySettingFinishedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingFinishedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sfToHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        binding.sfToUse.setOnClickListener {
            val intent = Intent(this, HowToUseActivity::class.java)
            startActivity(intent)
        }
    }
}