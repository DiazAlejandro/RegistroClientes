package edu.lasalle.oaxaca.registroclientes.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import edu.lasalle.oaxaca.registroclientes.data.ClienteDao

class ClienteViewModelFactory(private val clienteDao: ClienteDao) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ClienteViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ClienteViewModel(clienteDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}