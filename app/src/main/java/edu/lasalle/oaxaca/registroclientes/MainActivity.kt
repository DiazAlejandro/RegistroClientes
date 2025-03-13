package edu.lasalle.oaxaca.registroclientes

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var etNombre: EditText
    private lateinit var etMail: EditText
    private lateinit var etTelefono: EditText
    private lateinit var btnGuardar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNombre = findViewById(R.id.txtNombre)
        etMail = findViewById(R.id.txtCorreo)
        etTelefono = findViewById(R.id.txtTelefono)

        btnGuardar.setOnClickListener {
            val nombre = etNombre.text.toString()
            val email = etMail.text.toString()
            val telefono = etTelefono.text.toString()

            if (nombre.isNotEmpty() && email.isNotEmpty() && telefono.isNotEmpty()){
                Toast.makeText(this, "Cliente registrado: $nombre", Toast.LENGTH_SHORT).
                show()
            }else{
                Toast.makeText(this, "POR FAVOR REGISTRE TODOS LOS CAMPOS:",
                    Toast.LENGTH_SHORT).show()
            }
        }

    }
}








