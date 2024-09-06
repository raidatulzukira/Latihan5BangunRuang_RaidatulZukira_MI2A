package com.zukira.latihan5bangunruang_mi2a

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BilanganActivity : AppCompatActivity() {

    private lateinit var etBilangan : EditText
    private lateinit var btnDeteksi : Button
    private lateinit var txtHasilBilangan : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bilangan)

        etBilangan = findViewById(R.id.etBilangan)
        btnDeteksi = findViewById(R.id.btnDeteksi)
        txtHasilBilangan = findViewById(R.id.txtHasilBilangan)

        btnDeteksi.setOnClickListener() {
            val angka = etBilangan.text.toString().toInt()

            if ( angka % 2 == 0 ) {
                txtHasilBilangan.setText("Bilangan " + angka + " adalah bilangan genap")
            } else {
                txtHasilBilangan.setText("Bilangan " + angka + " adalah bilangan ganjil")
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}