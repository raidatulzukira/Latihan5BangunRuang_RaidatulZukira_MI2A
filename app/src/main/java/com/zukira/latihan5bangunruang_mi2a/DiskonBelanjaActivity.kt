package com.zukira.latihan5bangunruang_mi2a

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DiskonBelanjaActivity : AppCompatActivity() {

    private lateinit var etTotalBelanja : EditText
    private lateinit var btnDiskon : Button
    private lateinit var txtHasilDiskon : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_diskon_belanja)

        etTotalBelanja = findViewById(R.id.etTotalBelanja)
        btnDiskon = findViewById(R.id.btnDiskon)
        txtHasilDiskon = findViewById(R.id.txtHasilDiskon)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnDiskon.setOnClickListener() {
            val totalBelanja = etTotalBelanja.text.toString().toInt()

            if ( totalBelanja >= 100000 && totalBelanja <= 500000 ) {
                val diskon = etTotalBelanja.text.toString().toInt() * 0.1
                txtHasilDiskon.setText("Diskon anda sebesar " + diskon)
            } else if ( totalBelanja > 500000 && totalBelanja <= 1000000 ) {
                val diskon = etTotalBelanja.text.toString().toInt() * 0.2
                txtHasilDiskon.setText("Diskon anda sebesar " + diskon)
            } else if ( totalBelanja > 1000000 ) {
                val diskon = etTotalBelanja.text.toString().toInt() * 0.3
                txtHasilDiskon.setText("Diskon anda sebesar " + diskon)
            } else {
                txtHasilDiskon.setText("Anda tidak mendapatkan diskon")
            }
        }


    }
}