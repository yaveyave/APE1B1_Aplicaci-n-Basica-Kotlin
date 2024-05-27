package com.example.ape1b2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ventana2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana2)
        regresarVentana() //llamado de la función del botón de regreso a la panatalla principal
    }

    //Función de botón para regresar a la pantalla principal
    fun regresarVentana(){
        var btn_regresar = findViewById<Button>(R.id.btn_regresar)
        btn_regresar.setOnClickListener(){
            val regresarVentana:Intent = Intent(this, MainActivity::class.java)
            startActivity(regresarVentana)
        }
    }
}