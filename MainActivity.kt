package com.example.weather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //declarations
        val btnMain = findViewById<Button>(R.id.btnMain)
        val btnExit =findViewById<Button>(R.id.btnExit)

        btnMain?.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

            btnExit.setOnClickListener {
                finish()
                System.out.close()

            }

        }
    }
}