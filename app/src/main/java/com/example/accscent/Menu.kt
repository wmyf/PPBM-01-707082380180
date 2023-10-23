package com.example.accscent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btn_masuk = findViewById<Button>(R.id.button4) //ini tombol login yang pengen di pencet
        btn_masuk.setOnClickListener {
            val Intent = Intent(this, cardpiw::class.java)
            startActivity(Intent)
            val btn_masuk =
                findViewById<Button>(R.id.button5) //ini tombol login yang pengen di pencet
            btn_masuk.setOnClickListener {
                val Intent = Intent(this, spinah::class.java)
                startActivity(Intent)

                val btn_masuk =
                    findViewById<Button>(R.id.button3) //ini tombol login yang pengen di pencet
                btn_masuk.setOnClickListener {
                    val Intent = Intent(this, perfume::class.java)
                    startActivity(Intent)

                    val btn_masuk =
                        findViewById<Button>(R.id.button2) //ini tombol login yang pengen di pencet
                    btn_masuk.setOnClickListener {
                        val Intent = Intent(this, poison::class.java)
                        startActivity(Intent)


                        val btn_masuk =
                            findViewById<Button>(R.id.button1) //ini tombol login yang pengen di pencet
                        btn_masuk.setOnClickListener {
                            val Intent = Intent(this, blackmagic::class.java)
                            startActivity(Intent)
                        }
                    }
                }
            }

        }
    }
}
