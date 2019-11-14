package com.example.pokebattlewar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ButtonPlay.setOnClickListener {

            val intent:Intent = Intent(this,Main2Activity::class.java)
            startActivity(intent)
        }

        ButtonHelp.setOnClickListener {

            val intent:Intent = Intent(this,Main3Activity::class.java)
            startActivity(intent)
        }
    }
}
