package com.example.agendaria

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductoAdapter(private val listaProductos: List<Producto>) :
    RecyclerView.Adapter<ProductoAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgProducto: ImageView = view.findViewById(R.id.imgProducto)
        val txtNombre: TextView = view.findViewById(R.id.txtNombreProducto)
        val txtCantidad: TextView = view.findViewById(R.id.txtCantidad)
        val txtCaducidad: TextView = view.findViewById(R.id.txtCaducidad)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_producto, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val producto = listaProductos[position]
        holder.imgProducto.setImageResource(producto.imagen)
        holder.txtNombre.text = producto.nombre
        holder.txtCantidad.text = "Cantidad: ${producto.cantidad}"
        holder.txtCaducidad.text = "Caduca: ${producto.caducidad}"
    }

    override fun getItemCount(): Int = listaProductos.size
}
