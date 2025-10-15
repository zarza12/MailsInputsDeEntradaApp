package com.example.mailsinputsdeentradaapp.ui.theme.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun EjemploOutlinedTextField() {

    var email by remember { mutableStateOf("") }
    // By delega el get y set, se necesitan dos importaciones

    TarjetaEjemplo(
        titulo = "OutlinedTextField",
        description = "Campo de texto con fondo de relleno"
    ) {
        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("ejemplo@email.com") },
            leadingIcon = { Icon(Icons.Default.Email, null) },
            modifier = Modifier.fillMaxWidth()
        )
        if (email.isNotEmpty()){
            Text("Escribiste $email", fontSize = 12.sp, color = Color.Gray)
        }
    }

}