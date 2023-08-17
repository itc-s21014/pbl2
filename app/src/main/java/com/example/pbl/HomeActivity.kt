package com.example.pbl

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pbl.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.hmToSetting.setOnClickListener{
            val intent = Intent(this, TaskSettingActivity::class.java)
            startActivity(intent)
        }

        binding.hmStart.setOnClickListener{
            val intent = Intent(this, TimeSettingActivity::class.java)
            startActivity(intent)
        }

        binding.hmToHowToUse.setOnClickListener{
            val intent = Intent(this, HowToUseActivity::class.java)
            startActivity(intent)
        }

        val helper = SimpleDatabaseHelper(this)
        helper.writableDatabase.use { db ->
            Toast.makeText(this, "ログインしました",
                Toast.LENGTH_SHORT).show()
        }
    }
}