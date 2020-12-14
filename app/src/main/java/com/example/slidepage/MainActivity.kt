package com.example.slidepage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //Show the Hi data name
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name=findViewById<TextView>(R.id.text_hello)
        val dataName = intent.extras?.getString("dataName")
        name.text="Hi $dataName,"
    }
}