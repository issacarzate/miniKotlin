package com.example.issac.firstkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    var rValue:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun next(view:View){
        val intent = Intent(this, NextActivity::class.java)
        intent.putExtra("numero", rValue)
        startActivity(intent)
    }
    fun random(view: View){
        val r = Random()
        rValue=r.nextInt(100)
        val text = findViewById<TextView>(R.id.textVista)
        text.setText(rValue.toString())
    }
}
