package com.example.pbl

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pbl.databinding.ActivityMenuBinding

class MenuActivity: AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.task.setOnClickListener {
            val intent = Intent(this, TaskSettingActivity::class.java)
            startActivity(intent)
        }

         binding.character.setOnClickListener {
             val intent = Intent(this, CharacterActivity::class.java)
             startActivity(intent)
         }
    }
}