package com.example.pbl

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pbl.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.hmToSetting.setOnClickListener{
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

//        binding.hmStart.setOnClickListener{
//            val intent = Intent(this, )
//        }

        binding.hmToHowToUse.setOnClickListener{
            val intent = Intent(this, HowToUseActivity::class.java)
            startActivity(intent)
        }
    }

}