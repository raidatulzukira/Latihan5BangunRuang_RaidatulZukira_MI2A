package com.zukira.latihan5bangunruang_mi2a

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class KonversiSuhuActivity : AppCompatActivity() {

    private lateinit var etSuhu : EditText
    private lateinit var btnFahrenheit : Button
    private lateinit var btnKelvin : Button
    private lateinit var btnReamur : Button
    private lateinit var txtHasil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_konversi_suhu)

        etSuhu = findViewById(R.id.etSuhu)
        btnFahrenheit = findViewById(R.id.btnFahrenheit)
        btnKelvin = findViewById(R.id.btnKelvin)
        btnReamur = findViewById(R.id.btnReamur)
        txtHasil = findViewById(R.id.txtHasil)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnFahrenheit.setOnClickListener() {
            val hasil = (9 / 5) * etSuhu.text.toString().toInt() + 32
            txtHasil.setText("Hasil Konversinya = " + hasil)
        }

        btnKelvin.setOnClickListener() {
            val hasil = etSuhu.text.toString().toInt() + 273.15
            txtHasil.setText("Hasil Konversinya = " + hasil)
        }

        btnReamur.setOnClickListener() {
            val hasil = etSuhu.text.toString().toInt() * 0.8
            txtHasil.setText("Hasil Konversinya = " + hasil)
        }

    }
}