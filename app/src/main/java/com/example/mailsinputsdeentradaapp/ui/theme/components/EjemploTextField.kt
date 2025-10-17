package com.example.mailsinputsdeentradaapp.ui.theme.components

import androidx.compose.foundation.layout.fillMaxWidth
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
fun EjemploTextField(){
    var nombre by remember { mutableStateOf("") }
    // By delega el get y set, se necesitan dos importaciones

    TarjetaEjemplo(
        titulo = "TextField",
        description = "Campo de texto con fondo de relleno"
    ) {
        TextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text("Nombre") },
            placeholder = { Text("Escribe aqui") },
            modifier = Modifier.fillMaxWidth()
        )
        if (nombre.isNotEmpty()){
            Text("Escribiste $nombre", fontSize = 12.sp, color = Color.Gray)
        }
    }

}