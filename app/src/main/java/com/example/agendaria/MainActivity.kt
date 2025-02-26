package com.example.agendaria

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.agendaria.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ActividadAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configurar RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Lista de actividades de ejemplo
        val actividades = listOf(
            Actividad("Reunión de trabajo", "10:00 AM"),
            Actividad("Ir al gimnasio", "12:00 PM"),
            Actividad("Comprar víveres", "3:00 PM"),
            Actividad("Estudiar para el examen", "6:00 PM"),
            Actividad("Cena con amigos", "8:00 PM")
        )

        // Asignar Adaptador
        adapter = ActividadAdapter(actividades)
        recyclerView.adapter = adapter
    }
}
