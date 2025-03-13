package edu.lasalle.oaxaca.registroclientes.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import edu.lasalle.oaxaca.registroclientes.data.Cliente
import edu.lasalle.oaxaca.registroclientes.data.ClienteDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class ClienteViewModel(private val clienteDao: ClienteDao) : ViewModel() {

    val allClientes: Flow<List<Cliente>> = clienteDao.getAllClientes()

    fun insert(cliente: Cliente) {
        viewModelScope.launch {
            clienteDao.insert(cliente)
        }
    }
}