package com.example.pokebw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

open class MainActivity : AppCompatActivity() {

    companion object {
        var nickname:String?=null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ButtonPlay.setOnClickListener {

            val intent:Intent = Intent(this,Main2Activity::class.java)
            startActivity(intent)

            nickname=getinput.text.toString()
        }

        ButtonHelp.setOnClickListener {

            val intent:Intent = Intent(this,Main3Activity::class.java)
            startActivity(intent)
        }

        cfgbutton.setOnClickListener {

            val intent:Intent = Intent(this,Main5Activity::class.java)
            startActivity(intent)
        }

    }

    fun getnickaname():String{
        return nickname.toString()
    }
}