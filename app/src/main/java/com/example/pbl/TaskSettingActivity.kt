package com.example.pbl

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.pbl.databinding.ActivityTaskSettingBinding

class TaskSettingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTaskSettingBinding
    private val taskList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTaskSettingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val addButton: Button = findViewById(R.id.addButton)
        addButton.setOnClickListener {
            addTAsk()
        }

        binding.Finishbtn.setOnClickListener {
            val intent = Intent(this, CharacterActivity::class.java)
            startActivity(intent)
        }
    }

    private fun addTAsk() {
        val newTask = "New Task ${taskList.size + 1}"
        taskList.add(newTask)
    }
}