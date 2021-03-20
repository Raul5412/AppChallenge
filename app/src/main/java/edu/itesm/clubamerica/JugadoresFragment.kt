package edu.itesm.clubamerica

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_jugadores.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [JugadoresFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class JugadoresFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_jugadores, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        jugadores_recycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = JugadoresAdapter(createData())
        }
    }

    fun createData(): ArrayList<Jugador>{
        val jugadores = ArrayList<Jugador>()
        jugadores.add(Jugador(R.drawable.ochoa,"Guillermo Ochoa", "#13","Portero"))
        jugadores.add(Jugador(R.drawable.fuentes, "Luis Fuentes", "#2", "Defensa"))
        jugadores.add(Jugador(R.drawable.caceres, "Sebastian Cáceres", "#4", "Defensa"))
        jugadores.add(Jugador(R.drawable.bruno, "Bruno Valdez", "#18", "Defensa"))
        jugadores.add(Jugador(R.drawable.jorge, "Jorge Sánchez", "#3", "Defensa"))
        jugadores.add(Jugador(R.drawable.aquino, "Pedro Aquino", "#5", "Medio"))
        jugadores.add(Jugador(R.drawable.richard, "Richard Sánchez", "#20", "Medio"))
        jugadores.add(Jugador(R.drawable.fidalgo, "Álvaro Fidalgo", "#22", "Medio"))
        jugadores.add(Jugador(R.drawable.cordova, "Sebastian Córdova", "#17", "Medio"))
        jugadores.add(Jugador(R.drawable.lainez, "Mauro Lainez", "#28", "Medio"))
        jugadores.add(Jugador(R.drawable.suarez, "Leo Suárez", "#7", "Medio"))
        jugadores.add(Jugador(R.drawable.benedetti, "Nicolas Benedetti", "#14", "Medio"))
        jugadores.add(Jugador(R.drawable.roger, "Roger Martínez", "#9", "Delantero"))
        jugadores.add(Jugador(R.drawable.henry, "Henry Martin", "#21", "Delantero"))
        jugadores.add(Jugador(R.drawable.vinas, "Federico Viñas", "#24", "Delantero"))


        return jugadores
    }



}