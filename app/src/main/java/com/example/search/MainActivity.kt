package com.example.search

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
//    val text="Coding"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn1)
//        val text:String = "Hello"
        btn.setOnClickListener{
            Toast.makeText(applicationContext , "Coding",Toast.LENGTH_SHORT ).show()
//            Toast(context ,text="Hello ")

        }

    }
}