package edu.itesm.clubamerica

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class JugadoresAdapter (private val jugadores : List<Jugador>)
    : RecyclerView.Adapter<JugadoresAdapter.JugadorViewHolder>() {

    inner class JugadorViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var nombre = renglon.findViewById<TextView>(R.id.nombre)
        var numero = renglon.findViewById<TextView>(R.id.numero)
        var posicion = renglon.findViewById<TextView>(R.id.posicion)
        var foto = renglon.findViewById<ImageView>(R.id.foto)
    }

    //Crea el renglón
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JugadorViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.jugadores_renglon,parent, false)
        return JugadorViewHolder(renglon_vista)
    }

    //Asocia datos con los elementos del renglón
    override fun onBindViewHolder(holder: JugadorViewHolder, position: Int) {
        val jugador = jugadores[position]
        holder.foto.setImageResource(jugador.foto)
        holder.nombre.text = jugador.nombre
        holder.numero.text = jugador.numero
        holder.posicion.text = jugador.posicion
        holder.itemView.setOnClickListener {
            val action= JugadoresFragmentDirections.actionJugadoresFragment2ToJugadorFragment(jugador)
            holder.itemView.findNavController().navigate(action)
        }
    }

    // Cuantos elementos tiene la lista
    override fun getItemCount(): Int {
        return jugadores.size
    }
}