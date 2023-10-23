package com.example.accscent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn_masuk = findViewById<Button>(R.id.loginButton) //ini tombol login yang pengen di pencet
        btn_masuk.setOnClickListener {
            val Intent = Intent(this, Profile::class.java)
            startActivity(Intent)

        val btn_masuk = findViewById<Button>(R.id.registerButton) //ini tombol login yang pengen di pencet
        btn_masuk.setOnClickListener {
            val Intent = Intent(this, Register::class.java)
            startActivity(Intent)


        }
    }
    }
}