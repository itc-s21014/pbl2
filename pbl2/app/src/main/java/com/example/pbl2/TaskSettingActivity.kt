package com.example.pbl2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pbl2.databinding.ActivityTaskSettingBinding

class TaskSettingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTaskSettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTaskSettingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Finishbtn.setOnClickListener {
            val intent = Intent(this, CharacterActivity::class.java)
            startActivity(intent)
        }
    }
}