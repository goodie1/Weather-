package com.example.weather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import java.io.Serializable
import java.util.concurrent.locks.Condition

class MainActivity2 : AppCompatActivity() {
    private val Weather = arrayListOf<WeatherEntry>()

    data class WeatherEntry(
        val Min: Double,
        val Max: Double,
        val Day: String,
        val Condition: String
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        //declaration
        val btnSecond = findViewById<Button>(R.id.btnSecond)
        val btnLeave = findViewById<Button>(R.id.btnLeave)

        fun Weather(view: View) {
            val txtDAY = findViewById<EditText>(R.id.txtDay)
            val txtMin = findViewById<EditText>(R.id.txtMin)
            val txtMax = findViewById<EditText>(R.id.txtMax)
            val txtCondition = findViewById<EditText>(R.id.txtCondition)

            val Day = txtDAY.text.toString()
            val Min = txtMin.text.toString().toDoubleOrNull()
            val Max = txtMax.text.toString().toDoubleOrNull()
            val Condition = txtCondition.text.toString()

            if (Day.isNotEmpty() && Min != null && Max != null && Condition.isNotEmpty()) {
                Weather.add(WeatherEntry(Min, Max, Day, Condition))
                Toast.makeText(this, "Weather Condition added", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Please fill in all the texts", Toast.LENGTH_LONG).show()

            }
        }
            fun calculateAverageTemperature(): Double {
                var totalTemperature = 0.0
                for (entry in Weather) {
                    totalTemperature += (entry.Min + entry.Max) / 2
                }
                    return if (Weather.isNotEmpty()) totalTemperature/Weather.size else 0.0

            }

            btnLeave?.setOnClickListener {
                finish()
                System.out.close()

            btnSecond?.setOnClickListener {
                val intent =Intent(this, MainActivity3::class.java)
                startActivity(intent)
            }


            }


    }
}
