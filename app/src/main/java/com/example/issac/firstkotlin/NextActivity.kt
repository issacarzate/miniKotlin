package com.example.issac.firstkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val n = intent.getIntExtra("numero", -1)
        val texto = findViewById<TextView>(R.id.textView)
        texto.setText(n.toString())
    }
}
