package edu.itesm.clubamerica

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Jugador(val foto:Int,
                   val nombre:String,
                   val numero:String,
                   val posicion:String) : Parcelable
