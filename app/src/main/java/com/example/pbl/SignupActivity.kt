package com.example.pbl

import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pbl.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity(){
    private lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // まだ未完成
        val helper = SimpleDatabaseHelper(this)
        val Name = findViewById<EditText>(R.id.Name)
        val Password = findViewById<EditText>(R.id.Password)

        binding.signupregibtn.setOnClickListener {
            helper.writableDatabase.use { db ->
                val cv = ContentValues().apply {
                    put("name", Name.text.toString())
                    put("password", Password.text.toString())
                }
                db.insert("signup", null, cv)
                Toast.makeText(
                    this, "登録しました",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        //

        binding.signupregibtn.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}