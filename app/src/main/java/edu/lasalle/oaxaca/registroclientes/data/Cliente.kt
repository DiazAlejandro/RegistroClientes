package edu.lasalle.oaxaca.registroclientes.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cliente")
class Cliente (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nombre: String,
    val email: String,
    val telefono: String
)