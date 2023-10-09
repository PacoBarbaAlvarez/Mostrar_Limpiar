package com.example.copiar_texto

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.copiar_texto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton.setOnClickListener{
            binding.saludo.text = "Hola, " + binding.nombre.text.toString()
            Toast.makeText(this,binding.nombre.text.toString(), Toast.LENGTH_LONG).show()
        }

        binding.bLimpiar.setOnClickListener{
            binding.nombre.text.clear()
            binding.saludo.text = ""
        }
        /*
        var btn = findViewById<Button>(R.id.boton)

        var texto = findViewById<EditText>(R.id.nombre)

        var saludo = findViewById<TextView>(R.id.saludo)

        var limpiar = findViewById<Button>(R.id.bLimpiar)

        btn.setOnClickListener{
            saludo.text = "Hola, " + texto.text.toString()
        }

        limpiar.setOnClickListener{
            texto.text.clear()
            saludo.text = texto.text.toString()
        }

         */
    }
}