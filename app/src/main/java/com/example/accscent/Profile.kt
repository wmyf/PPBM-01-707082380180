package com.example.accscent

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Profile : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btn_masuk =
            findViewById<Button>(R.id.continuetoMenu) //ini tombol login yang pengen di pencet
        btn_masuk.setOnClickListener {
            val Intent = Intent(this, Menu::class.java)
            startActivity(Intent)

            val btn_masuk =
                findViewById<Button>(R.id.continuetoAbout) //ini tombol login yang pengen di pencet
            btn_masuk.setOnClickListener {
                val Intent = Intent(this, aboutapp::class.java)
                startActivity(Intent)
            }
        }
    }
}