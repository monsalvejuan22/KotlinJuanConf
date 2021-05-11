package com.example.conf.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.example.conf.MainActivity
import com.example.conf.R
import kotlin.concurrent.timer

class SplashscreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        val imagen = findViewById<ImageView>(R.id.imLogoElectromed)
        val animacion = AnimationUtils.loadAnimation(this,R.anim.animacion)

        val intent = Intent(this, MainActivity::class.java)



        imagen.startAnimation(animacion)

        animacion.setAnimationListener(object : Animation.AnimationListener{
            override fun onAnimationStart(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                startActivity(intent)
                finish()
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }

        })
    }
}