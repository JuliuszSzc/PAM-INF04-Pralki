package com.technischools.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numerPrania = findViewById<EditText>(R.id.numerPrania)
        val zatwierdz = findViewById<Button>(R.id.zatwierdz)
        val wynikPrania = findViewById<TextView>(R.id.wynikPrania)

        zatwierdz.setOnClickListener {
            val numer = numerPrania.text.toString().toIntOrNull()

            if (numer != null && numer in 1..12) {
                wynikPrania.text = "Numer prania: $numer"
            } else {
                Toast.makeText(this, "Podaj numer od 1 do 12", Toast.LENGTH_SHORT).show()
            }
        }
    }
}