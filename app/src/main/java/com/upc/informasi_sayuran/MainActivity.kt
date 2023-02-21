package com.upc.informasi_sayuran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val terong = findViewById<ImageView>(R.id.terong)
        terong.setOnClickListener {
            val intent = Intent(this, TerongActivity::class.java)
            startActivity(intent)
        }
        val wortel = findViewById<ImageView>(R.id.wortel)
        wortel.setOnClickListener {
            val intent = Intent(this, WortelActivity::class.java)
            startActivity(intent)
        }
        val selada = findViewById<ImageView>(R.id.selada)
        selada.setOnClickListener {
            val intent = Intent(this, SeladaActivity::class.java)
            startActivity(intent)
        }
        val tomat = findViewById<ImageView>(R.id.tomat)
        tomat.setOnClickListener {
            val intent = Intent(this, TomatActivity::class.java)
            startActivity(intent)
        }
        val cabai = findViewById<ImageView>(R.id.cabai)
        cabai.setOnClickListener {
            val intent = Intent(this, CabaiActivity::class.java)
            startActivity(intent)
        }
        val bawang = findViewById<ImageView>(R.id.bawang)
        bawang.setOnClickListener {
            val intent = Intent(this, BawangActivity::class.java)
            startActivity(intent)
        }
    }

}