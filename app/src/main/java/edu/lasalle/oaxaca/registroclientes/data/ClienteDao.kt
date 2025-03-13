package edu.lasalle.oaxaca.registroclientes.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ClienteDao {
    @Insert
    suspend fun insert (cliente: Cliente)

    @Query("SELECT * FROM cliente")
    fun getAllClientes(): Flow<List<Cliente>>
}