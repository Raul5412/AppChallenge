package edu.itesm.clubamerica

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_jugador.*

class JugadorFragment : Fragment() {

    private val args by navArgs<JugadorFragmentArgs>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_jugador, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        foto.setImageResource(args.jugador.foto)
        nombre.text = args.jugador.nombre
        numero.text = args.jugador.numero
        posicion.text = args.jugador.posicion
        Toast.makeText(context, args.jugador.nombre, 4000).show()

    }
}