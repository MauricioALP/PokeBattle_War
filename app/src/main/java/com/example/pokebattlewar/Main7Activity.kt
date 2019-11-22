package com.example.pokebattlewar

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main7.*

class Main7Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        modohistoria.setOnClickListener {

            val intent: Intent = Intent(this,Main6Activity::class.java)
            startActivity(intent)
        }

        modoversus.setOnClickListener {

            val intent: Intent = Intent(this,Main8Activity::class.java)
            startActivity(intent)
        }
    }

}