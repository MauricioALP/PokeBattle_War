package com.example.pokebattlewar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        iniciar.setOnClickListener {

            val intent: Intent = Intent(this,Main7Activity::class.java)
            startActivity(intent)
        }
    }
}
