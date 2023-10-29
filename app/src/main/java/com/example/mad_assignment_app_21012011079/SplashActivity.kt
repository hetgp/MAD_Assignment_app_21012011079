package com.example.mad_assignment_app_21012011079

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    lateinit var logoanimation: AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val logo: ImageView = findViewById(R.id.uvpce)
        logo.setBackgroundResource(R.drawable.start_animation)
        logoanimation = logo.background as AnimationDrawable;
        val myAnimation = AnimationUtils.loadAnimation(this, R.anim.twin_animation)
        logo.startAnimation(myAnimation)
        // Add an animation listener to your animation
        myAnimation.setAnimationListener(object : Animation.AnimationListener
        {
            override fun onAnimationStart(animation: Animation) {
                // Animation started
            }
            override fun onAnimationEnd(animation: Animation) {
                // Animation ended, start a new activity here
                val intent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intent)
            }
            override fun onAnimationRepeat(animation: Animation) {
                // Animation repeated
            }
        })
    }
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            logoanimation.start()
        } else {
            logoanimation.stop()
        }
    }
}