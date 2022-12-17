package com.example.ejercicio5listeners

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

@Suppress("RedundantIf")
class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var valRes = ""

        findViewById<Button>(R.id.button1).isEnabled = false

        findViewById<EditText>(R.id.editText1).setOnClickListener{
            if(findViewById<EditText>(R.id.editText1).text.toString() == "" && findViewById<EditText>(R.id.editText2).text.toString() == ""){
                findViewById<Button>(R.id.button1).isEnabled = false
            } else{
                findViewById<Button>(R.id.button1).isEnabled = true
            }
            findViewById<TextView>(R.id.textView1).setText("Edit Text nº 1")
        }

        findViewById<EditText>(R.id.editText2).setOnClickListener{
            if(findViewById<EditText>(R.id.editText1).text.toString() == "" && findViewById<EditText>(R.id.editText2).text.toString() == ""){
                findViewById<Button>(R.id.button1).isEnabled = false
            } else{
                findViewById<Button>(R.id.button1).isEnabled = true
            }
            findViewById<TextView>(R.id.textView1).setText("Edit Text nº 2")
        }

        findViewById<Button>(R.id.button1).setOnClickListener{
            var val01 = findViewById<EditText>(R.id.editText1).text.toString()
            var val02 = findViewById<EditText>(R.id.editText2).text.toString()
            valRes = val01 + " " + val02
            findViewById<EditText>(R.id.editText1).setText(valRes)
            findViewById<EditText>(R.id.editText2).setText(" ")
        }
    }
}