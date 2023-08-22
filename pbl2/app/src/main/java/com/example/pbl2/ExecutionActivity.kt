package com.example.pbl2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pbl2.databinding.ActivityExecutionBinding

class ExecutionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityExecutionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExecutionBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}