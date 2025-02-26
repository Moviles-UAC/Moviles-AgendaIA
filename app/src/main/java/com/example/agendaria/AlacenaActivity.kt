package com.example.agendaria

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AlacenaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alacena)

        // Obtener referencia del RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewAlacena)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Lista de productos de prueba
        val productos = listOf(
            Producto("Leche", "2 litros", "12/04/2025", R.drawable.home24),
            Producto("Arroz", "1 kg", "No caduca pronto", R.drawable.home24),
            Producto("Huevos", "12 unidades", "20/04/2025", R.drawable.home24),
            Producto("Manzanas", "4 unidades", "18/04/2025", R.drawable.home24),
            Producto("Pan", "1 paquete", "10/04/2025", R.drawable.home24)
        )

        // Asignar el adaptador al RecyclerView
        recyclerView.adapter = ProductoAdapter(productos)
    }
}
