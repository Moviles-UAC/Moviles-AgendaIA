package com.example.agendaria

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ActividadAdapter(private val listaActividades: List<Actividad>) :
    RecyclerView.Adapter<ActividadAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titulo: TextView = view.findViewById(R.id.txtTitulo)
        val hora: TextView = view.findViewById(R.id.txtHora)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_activity, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val actividad = listaActividades[position]
        holder.titulo.text = actividad.titulo
        holder.hora.text = actividad.hora
    }

    override fun getItemCount(): Int = listaActividades.size
}
