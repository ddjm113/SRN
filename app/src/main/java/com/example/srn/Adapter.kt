package com.example.srn

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val isotopesList : ArrayList<Isotopos>) : RecyclerView.Adapter<Adapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,
            parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentitem = isotopesList[position]

        holder.simblan.text = currentitem.simb_isot
        holder.ablan.text = currentitem.a_isot
        holder.nomblanc.text = currentitem.nomb_isot
        holder.zblan.text = currentitem.z_isot
        holder.boton.setOnClickListener {
            Toast.makeText(holder.itemView.context, "se presiono elemento "+currentitem.nomb_isot , Toast.LENGTH_SHORT).show()
            val intent = Intent(holder.itemView.context, Selpartre::class.java)
            intent.putExtra("nombre", currentitem.nomb_isot)
            intent.putExtra("simbolo", currentitem.simb_isot)
            intent.putExtra("masa", currentitem.masa_isot)
            intent.putExtra("valora", currentitem.a_isot)
            intent.putExtra("valorz", currentitem.z_isot)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return isotopesList.size
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)
    {
        val simblan : TextView = itemView.findViewById(R.id.simblan)
        val zblan : TextView = itemView.findViewById(R.id.zblan)
        val ablan : TextView = itemView.findViewById(R.id.ablan)
        val nomblanc : TextView = itemView.findViewById(R.id.nomblanc)
        val boton: Button = itemView.findViewById(R.id.bselblan)
    }

}