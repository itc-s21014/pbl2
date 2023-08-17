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
    companion object{
        private const val TABLE_NAME="signup"
    }
    private lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // まだ未完成
        val helper = SimpleDatabaseHelper(this)

        val signupId: Long = intent.getLongExtra("id", 0)
        if (signupId != 0L) {
            helper.readableDatabase.let {
                    db -> db.query(TABLE_NAME, arrayOf("id", "name", "password"), "id = ?", arrayOf(signupId.toString()), null, null, null, "1")
                .let { cursor ->
                    if (cursor.moveToFirst()) {
                        binding.Name.setText(cursor.getString(1))
                        binding.Password.setText(cursor.getString(2))
                    }
                }
            }
        }

        binding.signupregibtn.setOnClickListener {
            helper.writableDatabase.use { db ->
                val cv = ContentValues().apply {
                    put("name", binding.Name.text.toString())
                    put("password", binding.Password.text.toString())
                }
                if (signupId != 0L) {
                    db.update(TABLE_NAME, cv, "id = ?", arrayOf(signupId.toString()))
                }else{
                    db.insert(TABLE_NAME, null, cv)
                }
            }
            finish()
        }
        //

        binding.signupregibtn.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}