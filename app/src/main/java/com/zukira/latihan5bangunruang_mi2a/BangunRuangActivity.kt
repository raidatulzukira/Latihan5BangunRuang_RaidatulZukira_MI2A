package com.zukira.latihan5bangunruang_mi2a

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BangunRuangActivity : AppCompatActivity() {

    private lateinit var etPanjang : EditText
    private lateinit var etLebar : EditText
    private lateinit var etTinggi : EditText
    private lateinit var btnLuasPermukaan : Button
    private lateinit var btnVolume : Button
    private lateinit var txtHasilBangunRuang : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bangun_ruang)

        etPanjang = findViewById(R.id.etPanjang)
        etLebar = findViewById(R.id.etLebar)
        etTinggi = findViewById(R.id.etTinggi)
        btnLuasPermukaan = findViewById(R.id.btnLuasPermukaan)
        btnVolume = findViewById(R.id.btnVolume)
        txtHasilBangunRuang = findViewById(R.id.txtHasilBangunRuang)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnLuasPermukaan.setOnClickListener() {
            val panjang = etPanjang.text.toString().toInt()
            val lebar = etLebar.text.toString().toInt()
            val tinggi = etTinggi.text.toString().toInt()
            val hasil = 2 * ( panjang * lebar + panjang * tinggi + lebar * tinggi )
            txtHasilBangunRuang.setText("Luas Permukaan Balok adalah " + hasil)
        }

        btnVolume.setOnClickListener() {
            val panjang = etPanjang.text.toString().toInt()
            val lebar = etLebar.text.toString().toInt()
            val tinggi = etTinggi.text.toString().toInt()
            val hasil = panjang * lebar * tinggi
            txtHasilBangunRuang.setText("Volume Balok adalah " + hasil)
        }

    }
}