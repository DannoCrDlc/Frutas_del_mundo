package com.gdcdc.frutasdelmundo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val fruits: List<Fruit>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    val nombres = arrayOf(
        R.string.pomelo,
        R.string.piña,
        R.string.aguacate,
        R.string.arándanos,
        R.string.manzanas
    )
    val detalles = arrayOf(
        R.string.pomelo,
        R.string.piña,
        R.string.aguacate,
        R.string.arándanos,
        R.string.manzanas
    )
    val imagenes = arrayOf(
        R.drawable.logo,
        R.drawable.logo,
        R.drawable.logo,
        R.drawable.logo,
        R.drawable.logo
    )

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        val fruit = fruits[i]
        viewHolder.itemNom.text = fruit.name
        viewHolder.itemDet.text = fruit.description
        viewHolder.itemImagen.setImageResource(fruit.image)
    }

    override fun getItemCount(): Int {
        return nombres.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImagen: ImageView
        var itemNom: TextView
        var itemDet: TextView

        init {
            itemImagen = itemView.findViewById(R.id.item_image)
            itemNom = itemView.findViewById(R.id.item_nom)
            itemDet = itemView.findViewById(R.id.item_det)
        }
    }
}