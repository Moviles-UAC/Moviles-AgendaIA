package com.example.agendaria

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class FormularioAlacenaActivity : AppCompatActivity() {

    private lateinit var nombreProductoInputLayout: TextInputLayout
    private lateinit var nombreProductoEditText: TextInputEditText
    private lateinit var precioInputLayout: TextInputLayout
    private lateinit var precioEditText: TextInputEditText
    private lateinit var cantidadInputLayout: TextInputLayout
    private lateinit var cantidadEditText: TextInputEditText
    private lateinit var confirmarButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.formulario_alacena)

        // Initialize UI elements
        nombreProductoInputLayout = findViewById(R.id.nombreProductoInputLayout)
        nombreProductoEditText = findViewById(R.id.nombreProductoEditText)
        precioInputLayout = findViewById(R.id.precioInputLayout)
        precioEditText = findViewById(R.id.precioEditText)
        cantidadInputLayout = findViewById(R.id.cantidadInputLayout)
        cantidadEditText = findViewById(R.id.cantidadEditText)
        confirmarButton = findViewById(R.id.confirmarButton)

        confirmarButton.setOnClickListener {
            validateForm()
        }
    }

    private fun validateForm() {
        val nombreProducto = nombreProductoEditText.text.toString().trim()
        val precio = precioEditText.text.toString().trim()
        val cantidad = cantidadEditText.text.toString().trim()

        var isValid = true

        // Validate Nombre del producto
        if (nombreProducto.isEmpty()) {
            nombreProductoInputLayout.error = "Este campo es requerido"
            isValid = false
        } else {
            nombreProductoInputLayout.error = null
        }

        // Validate Precio
        if (precio.isEmpty()) {
            precioInputLayout.error = "Este campo es requerido"
            isValid = false
        } else {
            precioInputLayout.error = null
        }

        // Validate Cantidad disponible
        if (cantidad.isEmpty()) {
            cantidadInputLayout.error = "Este campo es requerido"
            isValid = false
        } else {
            cantidadInputLayout.error = null
        }

        if (isValid) {
            // All fields are filled, show success message
            Toast.makeText(this, "Datos guardados con éxito", Toast.LENGTH_SHORT).show()
            // Here you would save the data to a database or perform other actions
        } else {
            // Some fields are empty, show error message
            Toast.makeText(this, "Por favor, termine de rellenar el formulario", Toast.LENGTH_SHORT).show()
        }
    }
}