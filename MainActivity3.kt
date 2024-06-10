package com.example.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity3 : AppCompatActivity() {

    val Weather = arrayListOf<MainActivity2.WeatherEntry>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
         //DECLARTION
        val txt_Day = findViewById<EditText>(R.id.txt_Day)
        val txt_Condition = findViewById<EditText>(R.id.txt_Condition)
        val txt_Temp = findViewById<EditText>(R.id.txt_Temp)
        val btn_Main = findViewById<Button>(R.id.btn_Main)


        }

}