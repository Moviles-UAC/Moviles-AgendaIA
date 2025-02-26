package com.example.agendaria

import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class RecuperarContraseña : AppCompatActivity() {

    private lateinit var emailInputLayout: TextInputLayout
    private lateinit var emailEditText: TextInputEditText
    private lateinit var sendEmailButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recuperar_passoword) // Assuming you have the layout file

        emailInputLayout = findViewById(R.id.emailInputLayout)
        emailEditText = findViewById(R.id.emailEditText)
        sendEmailButton = findViewById(R.id.sendEmailButton)

        sendEmailButton.setOnClickListener {
            validateAndSendEmail()
        }
    }

    private fun validateAndSendEmail() {
        val email = emailEditText.text.toString().trim()

        if (email.isEmpty()) {
            emailInputLayout.error = "El correo electrónico es requerido"
            return
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            emailInputLayout.error = "Formato de correo electrónico inválido"
            return
        }

        // If we reach here, the email is valid.
        emailInputLayout.error = null // Clear any previous error
        sendEmail(email)
    }

    private fun sendEmail(email: String) {
        // In a real app, you would send the email here.
        // This is just a simulation for demonstration.
        Toast.makeText(this, "Su correo ha sido enviado con éxito a: $email", Toast.LENGTH_LONG).show()

        // You might want to navigate to another screen or finish this activity here.
        // finish()
    }
}