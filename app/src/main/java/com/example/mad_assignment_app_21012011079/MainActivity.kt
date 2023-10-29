package com.example.mad_assignment_app_21012011079

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Login : Button = findViewById(R.id.Login)
        Login.setOnClickListener {
            Intent(this,LoginActivity::class.java).also { startActivity(it) }
        }
        val SignUp : Button = findViewById(R.id.SignUp)
        SignUp.setOnClickListener {
            Intent(this,RegistationActivity::class.java).also { startActivity(it) }
        }

    }

}