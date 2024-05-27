package com.example.ape1b2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mostrarMensaje() //llamado de función
        siguienteVentana() //llamado de función
    }

//Función para mostrar mensaje
    fun mostrarMensaje(){
        val tv01 = findViewById<EditText>(R.id.ediText).text
        val btn1 = findViewById<Button>(R.id.btn_mostrar)
        btn1.setOnClickListener(){
            Toast.makeText(this, tv01, Toast.LENGTH_LONG).show()
        }
    }
//Función para ir a siguiente ventana
    fun siguienteVentana(){
        val btn1 = findViewById<Button>(R.id.btn_siguiente)
        btn1.setOnClickListener(){
            val saltarVentana2:Intent = Intent(this, Ventana2::class.java)
            startActivity(saltarVentana2)
        }
    }
}