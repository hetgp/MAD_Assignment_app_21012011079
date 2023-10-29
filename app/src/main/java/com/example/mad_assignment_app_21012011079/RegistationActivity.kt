package com.example.mad_assignment_app_21012011079

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegistationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registation)

        val Login : Button = findViewById(R.id.login)
        Login.setOnClickListener {
            Intent(this,LoginActivity::class.java).also { startActivity(it) }
        }

    }
}