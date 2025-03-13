package edu.lasalle.oaxaca.registroclientes
import android.app.Application
import edu.lasalle.oaxaca.registroclientes.data.AppDatabase

class ClienteApplication : Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this)}
}
